package backtracking;

public class Driver {
    public static void driver(){
//        Maze maze = new Maze();
//        boolean [][] maze1 = {
//                {true,true,false},
//                {true,true,true},
//                {true,true,true}
//        };
//        int [][] path = new int[maze1.length][maze1[0].length];
//        maze.printAllPath("", maze1,0,0,path,1);
//        System.out.println("All paths: \n"+maze.pathLURD("",maze1,0,0));
        NQueen nq = new NQueen();
        boolean [][] board = new boolean[6][6];
        nq.nQueen(board,0);
    }
}
