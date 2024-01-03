package SubsetItteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
    public static List<List<Integer>> comb(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for( int i=0 ; i< arr.length ; i++) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
//                inner.addAll(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
//                System.out.println(outer);
            }
        }
        return outer;
    }
    public static List<List<Integer>> combdup(int [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for( int i=0 ; i< arr.length ; i++) {
            int s=0;
            int e=0;
            System.out.println("i: "+i);
            if(i>0 && arr[i]==arr[i-1])
                s=e+1;
            e = outer.size();
            int n = outer.size();
            for (int j = s; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
//                inner.addAll(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
                System.out.println(outer);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,2,3};
        List<List<Integer>> li= comb(arr);
//        System.out.println(li);
        arr[3]=2;
        arr[0]=2;
        System.out.println(Arrays.toString(arr));
        li= combdup(arr);
        System.out.println(li);
    }
}
