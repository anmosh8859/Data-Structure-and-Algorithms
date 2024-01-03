package recursion;

import java.util.ArrayList;

public class Driver {
    public static void driver(){
        Maze maze = new Maze();
        ArrayList<String> al = maze.path("",3,3);
        System.out.println("All paths:\n"+al);
        System.out.println("All paths:\n"+maze.pathDiag("",3,3));
        System.out.println("Total Count: "+ maze.count(3,3));
    }
}