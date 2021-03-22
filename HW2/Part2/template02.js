var helpers = require( './helpers' );
var pt = require( './csce322hw02pt02' );

var maze = helpers.readMazeFile('./TestCases/part02test06.maze.g');
var moves = helpers.readMovesFile('./TestCases/part02test06.moves.g');
var before = maze.slice(0);

var theFunction = pt.onePlayerManyRotations( before );
var after = theFunction( moves );
helpers.printMaze( after );
