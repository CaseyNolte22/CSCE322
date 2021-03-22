module.exports = {
  onePlayerManyRotations: onePlayerManyRotations,
};

var helpers = require("./helpers");

function onePlayerManyRotations(maze) {
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

      var player1location_row = 0;
      var player1location_column = 0;

      for (row = 0; row < rotated.length; row++) {
        for (column = 0; column < rotated[0].length; column++) {
          if (rotated[row][column] == "1") {
            player1location_row = row;
            player1location_column = column;
            break;
          }
        }
      }

      while (rotated[player1location_row + 1][player1location_column] != "x") {
        if (rotated[player1location_row + 1][player1location_column] == "g") {
          rotated[player1location_row][player1location_column] = "-";
          rotated[player1location_row + 1][player1location_column] = "1";
          return rotated;
        }

        rotated[player1location_row][player1location_column] = "-";
        rotated[player1location_row + 1][player1location_column] = "1";
        player1location_row++;
      }

      maze = rotated;
    }

    return rotated;
  }

  return whatever;
}
