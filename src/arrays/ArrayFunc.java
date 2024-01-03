package arrays;

import java.util.Arrays;

public class ArrayFunc {
    public static void main(String[] args) {
        int[] arr =new int [5];
        arr[0]=90;
        arr[1]=34;
        arr[2]=65;
        arr[3]=55;
        arr[4]=75;
        int [] marks ;
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,1,4)));
    }

}
