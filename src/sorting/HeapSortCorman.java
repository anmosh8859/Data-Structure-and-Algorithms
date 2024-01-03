package sorting;

import java.util.Arrays;

public class HeapSortCorman {
    public int left(int i){
        return 2*i+1;
    }
    public int right(int i){
        return 2*i+2;
    }

    public void maxHeapify(int [] arr, int i, int heapSize){
        int left = left(i);
        int right = right(i);
        int largest;
        if(left<heapSize && arr[left] > arr[i]) largest = left;
        else largest = i;
        if(right<heapSize && arr[right] > arr[largest]) largest = right;
        if(largest!=i){
            exchange(arr,largest,i);
            maxHeapify(arr, largest, heapSize);
        }
    }
    public void buildMaxHeap(int [] arr){
        int heapSize = arr.length;
        for (int i = (heapSize/2)-1; i >=0 ; i--) {
            maxHeapify(arr,i,heapSize);
        }
    }
    public void heapSort(int [] arr){
        int len = arr.length;
        buildMaxHeap(arr);
        for (int i = len-1 ; i > 0 ; i--) {
            exchange(arr,0,i);
            len--;
            maxHeapify(arr,0,len);
        }
    }
    private void exchange(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1]= arr[num2];
        arr[num2] = temp;
    }
}
