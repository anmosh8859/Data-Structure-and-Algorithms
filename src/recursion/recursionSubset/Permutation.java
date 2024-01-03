package recursion.recursionSubset;

import java.util.ArrayList;

public class Permutation {
    public static ArrayList<String> perm(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        char ch=up.charAt(0);
        ArrayList<String> list= new ArrayList<>();
        for(int i = 0 ; i<= p.length(); i++){
            String s =p.substring(0,i);
            String n=p.substring(i,p.length());
            list.addAll(perm(s+ch+n,up.substring(1)));
        }
        return list;
    }
    public static void main(String[] args) {
        String s ="Anand";
        ArrayList<String> sl = new ArrayList<>();
        sl = perm("",s);
        System.out.println(sl);
    }
}
