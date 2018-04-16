/**

  Return a boolean for the statement:
  "The maze is navigable, having a legal and continuous travel path that traverses from any start start to any treasure."

**/

public class MazeSolver {

  public Maze maze;

  public MazeSolver(Maze maze) {
    this.maze = maze;
  }

  public Boolean solve() {
    if (maze.explorerIsOnA() == maze.TREASURE) {
      //System.out.println("found treasure");
      //base case 1
      return true;
    }
    else if (maze.explorerIsOnA() == maze.WALL) {
      //base case 2
      return false;
    }
    else {
      for (int direction = 1; direction <= 8; direction*=2) {
        //take a snapshot for easy "undo"
        Maze snapshot = new Maze(maze);
        //System.out.println("New direction: " + direction);
        //System.out.println(direction + " " + snapshot.toString());
        //drop a wall at your location to signal you've been there
        maze.dropA(maze.WALL);
        //go in all four directions
        maze.go(direction);
        //System.out.println("recalling...");
        if (solve()) {
          //System.out.println(maze);
          //without if, maze = snapshot would be an unreachable statement
          return true;
        }
        maze = snapshot;
        //System.out.println("snapshot");
      }
    }
    //if all else fails...
    return false;
  }

  public String toString() {
    return String.valueOf(solve());
   }
}
