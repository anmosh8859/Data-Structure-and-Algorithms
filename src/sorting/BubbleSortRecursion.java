package sorting;

import java.util.Arrays;

public class BubbleSortRecursion {
    static int [] bsr(int [] arr,int c, int r){
        if(c==0)
            return arr;
        else if(c>r){

            if(arr[r]>arr[r+1]){
                int temp = arr[r];
                arr[r]=arr[r+1];
                arr[r+1] = temp;
            }
            return bsr(arr, c , r+1);
        }
        else return bsr(arr,c-1,0);
    }
    public static void main(String[] args) {
        int [] arr = {3,9,4,5,89};
        arr =bsr(arr, arr.length-1, 0 );
        System.out.println(Arrays.toString(arr));
    }
}
