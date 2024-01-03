package sorting;

import java.util.Arrays;

public class SelectionSortRecursion {
    static int [] ssr(int [] arr,int start, int end, int highest){
        if(end==0)
            return arr;
        else if(start<=end){
            if(arr[start]>arr[highest])
                highest=start;
            return ssr(arr,start+1,end,highest);
        }
        else{
            int temp= arr[highest];
            arr[highest]=arr[end];
            arr[end]=temp;
            return ssr(arr,1,end-1,0);
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        arr =ssr(arr,1,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
