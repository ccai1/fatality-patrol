/**

  test MazeSolver.
  Specify filename and explorer position from command line.

**/

public class UserOfMazeSolver {

  private static Displayer displayer;

  public static void main(String[] args)
     throws java.io.FileNotFoundException {

       System.out.println( );
       System.out.println( "Maze Solution?" + System.lineSeparator());

       Maze maze = new Maze( args[0]
                         , Integer.parseInt( args[1])
                         , Integer.parseInt( args[2])
                         );

     displayer = new Displayer( Integer.parseInt( args[3]));
     display(maze);

     System.out.println(System.lineSeparator()
     + new MazeSolver(maze)
     + System.lineSeparator());
   }

   private static void display( Maze m) {
       int step = 1;

       displayer.atTopOfWindow( m + "step " + step++);

       // move past west edge, Displaying as we go
       while( step < 5) {
           m.go( Maze.WEST);
           displayer.atTopOfWindow( m + "step " + step++);
       }
   }
}
