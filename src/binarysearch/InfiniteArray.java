package binarysearch;

public class InfiniteArray {
    int infiniteBinarySearch(int [] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newstart = start;
            end = start + 2*(end - start +1);
            start = newstart;
        }
         return itterativeBinarySearch(arr, target, start,end);
    }
    int itterativeBinarySearch(int [] arr, int target, int start, int end){
        if(target<arr[start]&&target>arr[end]) return -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]) return mid;
            else if(target<arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
