module.exports = {
  readMazeFile: readMazeFile,
  readMovesFile: readMovesFile,
  printMaze: printMaze,
  printMoves: printMoves,
  rotateClockwise: rotateClockwise,
  rotateCounterClockwise: rotateCounterClockwise,
  rotate180: rotate180,
};

function readMazeFile(file) {
  var text;
  var lines = [];
  var rows = [];
  var filesystem = require("fs");

  text = filesystem.readFileSync(file);
  rows = text.toString().split("\n");
  rows.pop();

  var maze = [];
  for (var r = 0; r < rows.length; r++) {
    maze[r] = [];
    for (var c = 0; c < rows[r].length; c++) {
      maze[r][c] = rows[r].charAt(c);
    }
  }

  return maze;
}

function readMovesFile(file) {
  var text;
  var line = [];
  var filesystem = require("fs");
  var row = [];
  var moves = [];

  text = filesystem.readFileSync(file);
  moves = text.toString().split("\n");

  return moves;
}

function printMaze(maze) {
  for (var r = 0; r < maze.length; r++) {
    var row = "";
    for (var c = 0; c < maze[r].length; c++) {
      row = row + maze[r][c];
    }
    console.log(row);
  }
}

function printMoves(moves) {
  var moveString = "";
  for (var m = 0; m < moves.length; m++) {
    moveString = moveString + moves[m];
  }
  console.log(moveString);
}

function rotateClockwise(maze) {
  var rotated = [];
  for (i = 0; i < maze[0].length; i++) {
    var tempRow = [];
    for (j = 0; j < maze.length; j++) {
      tempRow.unshift(maze[j][i]);
    }
    rotated[i] = tempRow;
  }
  return rotated;
}

function rotateCounterClockwise(maze) {
  var rotated90 = rotateClockwise(maze);
  var rotated180 = rotateClockwise(rotated90);
  var rotated270 = rotateClockwise(rotated180);

  return rotated270;
}

function rotate180(maze) {
  var rotated90 = rotateClockwise(maze);
  var rotated180 = rotateClockwise(rotated90);

  return rotated180;
}
