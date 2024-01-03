package binarysearch;

public class Ceiling {
    public int recursiveCeiling(int [] arr, int target, int start, int end){
        if(target>arr[arr.length-1]) return -1;
        int mid = start + (end - start)/2;
        if(start>=end) return start;
        else if(arr[mid] == target) return mid;
        else if(arr[mid]>target) return recursiveCeiling(arr, target, start, mid-1);
        else return recursiveCeiling(arr, target, mid+1, end);
    }
    public int itterativeCeiling(int [] arr, int target){
        if(target>arr[arr.length-1]) return -1;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            else if(target < arr[mid]) end = mid - 1;
            else  start = mid + 1;
        }
        return start;
    }
}
