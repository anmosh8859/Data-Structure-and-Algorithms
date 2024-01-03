package other;

import java.util.ArrayList;

public class DiceCombination {
    public static ArrayList<String> dc(String s, int target){
        if(target==0) {
            ArrayList<String> li = new ArrayList<>();
            li.add(s);
            return li;
        }
        ArrayList<String> li = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target; i++) {
            li.addAll(dc(s+i,target-i));
        }
        return li;
    }

    public static void main(String[] args) {
        System.out.println(dc("",4));
    }
}
