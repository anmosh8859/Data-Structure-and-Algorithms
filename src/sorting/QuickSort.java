package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void qs(int [] arr, int low, int high){
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = mid;
        if(low>=high)
            return;
        while(start<=end){
            while(arr[start]<arr[pivot])
                start++;
            while(arr[end]>arr[pivot])
                end--;
            if(start<=end){
                int temp= arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        System.out.println("Partition: "+Arrays.toString(arr));
        qs(arr,low,end);
        qs(arr,start, high);
    }

    public static void main(String[] args) {
//        int [] arr ={3,2,1};
        int [] arr = {2,5,40,60,10,30,42,46,14,96,0,-1};
        qs(arr,0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
