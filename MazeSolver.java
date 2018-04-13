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
      return true;
    }
    else if (maze.explorerIsOnA() == maze.WALL) {
      return false;
    }
    else {
      for (int direction = 1; direction <= 8; direction*=2) {
        Maze snapshot = new Maze(maze);
        //System.out.println("New direction: " + direction);
        //System.out.println(direction + " " + snapshot.toString());
        maze.dropA(maze.WALL);
        maze.go(direction);
        //System.out.println("recalling...");
        if (solve()) {
          //System.out.println(maze);

          return true;
        }
        maze = snapshot;
        //System.out.println("snapshot");
      }
    }
    return false;
  }

  public String toString() {
    return String.valueOf(solve());
   }
}
