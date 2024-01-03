package binarysearch;

public class Floor {
    public int recursiveFloor(int [] arr, int target, int start, int end){
        if(target<arr[0]) return -1;
        int mid = start + (end - start)/2;
        if(arr[mid]==start) return mid;
        else if(start>=end) return end;
        else if(arr[mid]<target) return recursiveFloor(arr, target, mid + 1, end);
        else return recursiveFloor(arr, target, start, mid - 1);
    }
    public int itterativeFloor(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            if(target < arr[0]) return -1;
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid]<target) start = mid+1;
            else end = mid -1;
        }
        return end;
    }
}
