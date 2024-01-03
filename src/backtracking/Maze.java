package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    ArrayList<String> pathLURD(String s, boolean [][] maze, int r, int c){
        int rowLen = maze[0].length;
        int colLen = maze.length;
        if(r==rowLen-1&&c==colLen-1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(s);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(!maze[r][c]) return ans;
        maze[r][c] = false;
        if(r<rowLen - 1) ans.addAll(pathLURD(s + "D",maze, r+1,c));
        if(c<colLen-1) ans.addAll(pathLURD(s + "R",maze, r,c+1));
        if(r>0) ans.addAll(pathLURD(s + "U",maze,r-1,c));
        if(c>0) ans.addAll(pathLURD(s+"L", maze, r, c-1));
        maze[r][c] = true;
        return ans;
    }
    void printAllPath(String s, boolean [][] maze, int r, int c, int [][]path, int step){
        int colLen = maze[0].length;
        int rowLen = maze.length;
        if(r==rowLen-1 && c == colLen-1){
            path[r][c] = step;
            for(int [] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);
            System.out.println();
            return;
        }

        if(!maze[r][c]) return;

        maze[r][c] = false;
        path[r][c] = step;

        if(r < rowLen - 1) printAllPath(s+"D", maze, r+1,c,path,step+1);
        if(c < colLen - 1) printAllPath(s+"R", maze, r,c+1,path,step+1);
        if(r>0) printAllPath(s+"U", maze, r-1,c,path,step+1);
        if(c>0) printAllPath(s+"L", maze, r,c-1,path,step+1);

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
