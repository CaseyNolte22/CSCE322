module.exports = {
  onePlayerOneRotation: onePlayerOneRotation,
};

var helpers = require("./helpers");

function onePlayerOneRotation(maze) {
  function whatever(move) {
    rotated = helpers.rotateClockwise(maze);

    return rotated;
  }
  return whatever;
}
