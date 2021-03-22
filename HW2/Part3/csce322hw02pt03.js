module.exports = {
  manyPlayersManyRotations: manyPlayersManyRotations,
};

var helpers = require("./helpers");

function manyPlayersManyRotations(maze) {
  numPlayers = 0;
  for (row = 0; row < maze.length; row++) {
    for (column = 0; column < maze[0].length; column++) {
      if (
        maze[row][column] > numPlayers &&
        (maze[row][column] == 1 ||
          maze[row][column] == 2 ||
          maze[row][column] == 3 ||
          maze[row][column] == 4 ||
          maze[row][column] == 5)
      ) {
        numPlayers = maze[row][column];
      }
    }
  }

  function whatever(moves) {
    for (k = 0; k < moves.length; k++) {
      move = moves[k];

      if (move == "c") {
        rotated = helpers.rotateClockwise(maze);
      }
      if (move == "cc") {
        rotated = helpers.rotateCounterClockwise(maze);
      }
      if (move == "180") {
        rotated = helpers.rotate180(maze);
      }
     
      // not elegent or efficient but it works
      stopFlag = 0;
      for (j = 0; j < 20; j++) {
        for (i = 1; i <= numPlayers; i++) {
          goaled = helpers.dropPlayer(rotated, i);
          if (goaled == 1) {
              stopFlag = 1;
              for (m = 1; m < i; m++) {
                  helpers.dropPlayer(rotated,m);
              }
          }
        }
        
        if (stopFlag == 1) {
          return rotated;
        }
      }

      maze = rotated;
    }

    return rotated;
  }

  return whatever;
}
