package other;

import java.util.*;

public class ArrayFreqSort {
    static Map<Integer,Integer> map = new HashMap<>();
    public static void qs(int [] arr, int low, int high) {
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = mid;
        if (low >= high)
            return;
        while (start <= end) {
            while (map.get(arr[start]) < map.get(arr[pivot]))
                start++;
            while (map.get(arr[end]) > map.get(arr[pivot]))
                end--;
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
    public int[] aFS(int [] arr){

        for(int i = 0 ; i < arr.length ; i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else map.put(arr[i],map.get(arr[i])+1);
        }
        int [] res = new int[map.size()];
        int count = 0;
        for(int k: map.keySet()){
            res[count] = k;
            count++;
        }
        System.out.println(map);
        qs(res,0, res.length - 1);
        System.out.println(Arrays.toString(res));
        count = 0;
        for(int i = res.length-1; i >=0 ; i--){
            for(int j = 0 ; j < map.get(res[i]) ; j++){
                arr[count] = res[i];
                count++;
            }
        }
        return arr;
    }  
}
