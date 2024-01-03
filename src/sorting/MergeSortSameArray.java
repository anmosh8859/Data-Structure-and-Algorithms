package sorting;

import java.util.Arrays;

public class MergeSortSameArray {
    public static void mssa(int [] array, int start, int end){
        if(end-start==1){
            return;
        }
        else{
            int mid = (end+start)/2;
            mssa(array,start,mid);
            mssa(array,mid,end);
            merge(array , start, mid, end);
        }
    }
    public static void merge(int [] arr, int s, int m, int e){
        int [] merged = new int[e-s];
        int i=s, j=m, k=0;
        while(i<m&&j<e){
            if(arr[i]<arr[j]){
                merged[k]=arr[i];
                i++;
                k++;
            } else{
                merged[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<m){
            merged[k]=arr[i];
            k++;
            i++;
        }
        while(j<e){
            merged[k]=arr[j];
            k++;
            j++;
        }
        for (int l = 0; l < merged.length; l++) {
            arr[s+l]=merged[l];
        }
    }

    public static void main(String[] args) {
        int [] arr = {7,84,5,6,1,3,45,9,65};
        mssa(arr,0 , arr.length);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
}
