# maze project
holmes apcs period 05

## personnel

cathy cai & jeffrey rusovskiy

## statement of problem

Return a boolean for the statement: "The maze is navigable, having a legal and continuous travel path that traverses from any start start to any treasure."

## recursive abstraction

When asked to navigate a path, the recursive abstraction can navigate a path with one less stepping stone.

## base case

You are on the treasure or there are no more paths available.

## algorithm psuedocode

    if "E" is on the treasure, return true
    if there are no more paths available, return false
    else if "E" is on a stepping stone
        for each direction
            move "E"
            invoke recursive abstraction

## class(es), with fields and methods


## version *n* wish list


## known bugs :(



