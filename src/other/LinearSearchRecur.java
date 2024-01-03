package other;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class LinearSearchRecur {
    static boolean lsrstart(int [] arr, int target, int index){
        if(index==arr.length)
            return false;
        else if(arr[index]==target)
            return true;
        else return lsrstart(arr, target, index+1);
    }
    static boolean lsrend(int [] arr, int target, int index){
        if(index==-1)
            return false;
        else if(arr[index]==target)
            return true;
        else return lsrend(arr, target, index-1);
    }
    static int lsrindexstart(int [] arr, int target, int index){
        if(index== arr.length)
            return -1;
        else if(arr[index]==target)
            return index;
        else return lsrindexstart(arr, target, index+1);
    }
    static int lsrindexend(int [] arr, int target, int index){
        if(index== -1)
            return index;
        else if(arr[index]==target)
            return index;
        else return lsrindexend(arr, target, index-1);
    }
    static void lsrindexes(int [] arr, int target, int index){
        if(index > arr.length-1)
            return;
        else if(arr[index]==target)
            al.add(index);
        lsrindexes(arr, target, index+1);
    }
    static ArrayList<Integer> lsrindexes(int [] arr, int target, int index, ArrayList<Integer> al){
        if(index > arr.length-1)
            return al;
        else if(arr[index]==target)
            al.add(index);
        return lsrindexes(arr, target, index+1, al);
    }
    static ArrayList<Integer> lsrindexes1(int [] arr, int target, int index){
        ArrayList<Integer> al1= new ArrayList<>();
        if(index > arr.length-1)
            return al1;
        else if(arr[index]==target)
            al1.add(index);
        al1.addAll(lsrindexes1(arr, target, index+1));
        return al1;
    }
    static ArrayList<Integer> al =new ArrayList<>();
    public static void main(String[] args) {
        int [] arr= {0,1,2,75,4,7,75,7,8,9};
        System.out.println("Result: "+lsrstart(arr,75,0));
        boolean result=lsrend(arr,75, arr.length-1);
        System.out.println("Result: "+result);
        System.out.println("Result: "+ lsrindexstart(arr,75,0));
        System.out.println("Result: "+ lsrindexend(arr,75, arr.length-1));
        lsrindexes(arr,75,0);
        System.out.println(al);
        al.clear();
        al = lsrindexes(arr,75,0,al);
        System.out.println("Result: "+ al);
        al.clear();
        al = lsrindexes1(arr,75,0);
        System.out.println("lsrindexes1's Result: "+al);
    }
}
