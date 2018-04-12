/**

  test MazeSolver.
  Specify number of ranks and number of files for the maze from command line.

**/

public class UserOfMazeSolver {

  public static void main(String[] args)
     throws java.io.FileNotFoundException {

       System.out.println( );

       inProgress = new Maze(fileName, rank, file);

       oneTest(inProgress)

     }

  private static void oneTest(Maze solveMe)
  {
       System.out.println( solveMe.toString()
       + System.lineSeparator()
       + new MazeSolver(solveMe)
       + System.lineSeparator());
     }
}
