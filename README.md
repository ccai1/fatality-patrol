# maze-project
holmes apcs period 05

## personnel

cathy cai & jeffrey rusovskiy

## statement of problem

Return a boolean for the statement: "The maze is navigable, having a legal and continuous travel path that traverses from any start start to any treasure."

## recursive abstraction

When asked to navigate a path, the recursive abstraction can navigate a path from its last turn. If there is a dead end, call on the recursive abstraction again.

## base case

You are one move away from the treasure.

## algorithm psuedocodes

#### algorithm psuedocode 2 a.m. version

    find the treasure

#### algorithm psuedocode -1

    begin at designated startpoint

      iterate through maze
  
    end at designated endpoint

#### algorithm psuedocode 0

    begin at designated startpoint

      for all paths:
  
        randomly choose a direction for an adjacent cell
    
        if adjacent cell has not yet been visited,
    
          embark on the adjacent cell
      
        else,
    
          choose another direction
      
        but if all adjacent cells has been visited,
    
          backtrack to the last cell that has an unvisited adjacent cell
      
    end when no cells have an unvisited adjacent cell and treasure has not yet been reached (no solution)

## class(es), with fields and methods


## version *n* wish list


