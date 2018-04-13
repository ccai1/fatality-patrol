/**

  test MazeSolver.

**/

public class UserOfMazeSolver {

  public static void main(String[] args)
     throws java.io.FileNotFoundException {

       System.out.println( );
       System.out.println( "Maze Solution?");

       Maze maze = new Maze( args[0]
                         , Integer.parseInt( args[1])
                         , Integer.parseInt( args[2])
                         );
       System.out.println( maze.toString()
       + System.lineSeparator()
       + new MazeSolver(maze)
       + System.lineSeparator());
     }
}
