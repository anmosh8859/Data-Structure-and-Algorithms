package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    //    void path(String s, int r, int c){
//        if(c==1 && r==1) {
//            System.out.println("Path: "+s);
//            return;
//        }
//        if (r>1) path(s+ "R" ,r-1,c);
//        if (c>1) path(s + "D",r,c-1);
//    }
    ArrayList<String> path(String s, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(s);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r == 2 && c == 2) return ans;
        if (r > 1) ans.addAll(path(s + "R", r - 1, c));
        if (c > 1) ans.addAll(path(s + "D", r, c - 1));
        return ans;
    }

    int count(int r, int c) {
        if (c == 1 || r == 1) return 1;
        else return count(r - 1, c - 1) + count(r - 1, c) + count(r, c - 1);
    }

    ArrayList<String> pathDiag(String s, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(s);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1 && c > 1) ans.addAll(pathDiag(s + "Dia", r - 1, c - 1));
        if (r > 1) ans.addAll(pathDiag(s + "R", r - 1, c));
        if (c > 1) ans.addAll(pathDiag(s + "D", r, c - 1));
        return ans;
    }
}
