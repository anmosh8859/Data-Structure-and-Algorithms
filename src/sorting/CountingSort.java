package sorting;
import java.util.Arrays;
public class CountingSort {
    public void cs(int [] arr){
        int len = arr.length;
        int max = arr[0];
        for(int i = 1 ; i < len ; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        max+=1;

        int [] count = new int[max];
        for( int i = 0 ; i < len ; i++)
            count[arr[i]]++;

        for( int i = 0 ; i < max - 1 ; i++)
            count[i+1]+=count[i];

        int [] output = new int[len];
        for( int i = len - 1 ; i >=0 ; i++){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for( int i = 0 ; i < len ; i++)
            arr[i] = output [i];
    }
}
