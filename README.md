# maze project
holmes apcs period 05

## personnel

Cathy Cai & Jeffrey Rusovskiy

## statement of problem

Return a boolean for the statement: "The maze is navigable, having a legal and continuous travel path that traverses from any start start to any treasure."

## recursive abstraction

When asked to navigate a path, the recursive abstraction can navigate a path with one less stepping stone.

## base case

You are on the treasure or you are on a wall.

## algorithm psuedocode

    if "E" is on the treasure, return true
    if you are on a wall, return false
    else
        for each direction
            take snapshot
            drop wall
            move "E"
            invoke recursive abstraction
            set maze to snapshot

## class(es), with fields and methods

Displayer
Maze
UserOfMaze
MazeSolver
UserOfMazeSolver

## version *n* wish list

GUI for maze route

## known bugs

When the explorer reaches a treasure or wall (base cases), its position could not incremented to reach the actual treasure/wall without causing a null pointer exception (in the Vector subclass in Maze and add method).

