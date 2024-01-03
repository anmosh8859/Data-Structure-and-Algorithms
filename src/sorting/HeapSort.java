package sorting;

import java.util.Arrays;

public class HeapSort {
    static void buildHeap(int [] arr, int n){
        for(int i = (n-2)/2; i>=0; i--){
            heapify(arr,n,i);
        }
    }
    static void heapify(int [] arr, int n, int i){
        int largest = i, left =2*i+1, right = 2*i+2;
        if(left<n&&arr[left]>arr[largest])
            largest = left;
        if(right<n&&arr[right]>arr[largest])
            largest = right;
        if(largest!=i){
            swap(arr, largest, i);
            heapify(arr,n,largest);
        }
    }
    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void heapSort(int [] arr, int n){
        buildHeap(arr,n);
        for(int i = n-1 ; i>=0 ; i--){
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int [] arr = {15,78,95,45,62,87,46,29};
        heapSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
