var helpers = require("./helpers");
var pt = require("./csce322hw02pt01");

var maze = helpers.readMazeFile("./TestCases/part01test07.maze.g");
var moves = helpers.readMovesFile("./TestCases/part01test07.moves.g");
var before = maze.slice(0);
var theFunction = pt.onePlayerOneRotation(before);
var after = theFunction(moves[0]);

helpers.printMaze(after);
