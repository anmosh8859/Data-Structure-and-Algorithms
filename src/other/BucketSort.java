package other;

import java.util.ArrayList;

public class BucketSort {
    public static void bs(int [] arr, int totbuck){
        int len = arr.length;
        int max = arr[0];
        for( int i = 1 ; i<len ; i++)
            max = Math.max(max,arr[i]);
        max++;
        ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i < totbuck ; i++)
            bkt.add(new ArrayList<>());
        for( int i = 0 ; i < len ; i++){

        }
    }
}
