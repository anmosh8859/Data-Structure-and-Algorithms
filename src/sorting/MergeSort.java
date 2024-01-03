package sorting;

import java.util.Arrays;

public class MergeSort {
    public static int [] ms(int [] arr){
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;
        int [] first = ms(Arrays.copyOfRange(arr,0,mid));
        int [] second = ms(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }
    public static int [] merge(int [] first, int [] second){
        int i=0,j=0,k=0;
        int [] merged = new int[first.length+ second.length];
        while(i< first.length&&j< second.length){
            if(first[i]<second[j]){
                merged[k]=first[i];
                i++;
            } else {
                merged[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            merged[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            merged[k]=second[j];
            j++;
            k++;
        }
        return merged;
    }

    public static void main(String[] args) {
        int [] arr = {7,84,5,6,1,3,45,9,65};
        arr=ms(arr);
        System.out.println(Arrays.toString(arr));
    }
}
