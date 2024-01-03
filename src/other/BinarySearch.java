package other;

public class BinarySearch {
    static int bs(int[] arr, int number, int start, int end){
        if(start>end)
            return -1;
        int mid= start+ (end-start)/2;
        if(arr[mid]==number)
            return mid;
        else if(arr[mid]<number)
            return bs(arr,number,mid+1,end);
        else
            return bs(arr,number,start,mid-1);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int a=bs(arr,5,0,arr.length-1);
        System.out.println(a);
    }
}
