package sorting;

public class RadixSort {
    public static void cs(int [] arr , int exp){
        int len = arr.length;
        int [] count = new int[10];
        for( int i = 0 ; i < len ; i++){
            count[arr[i]/exp%10]++;
        }
        for( int i = 0 ; i < 9 ; i++){
            count[i+1]+=count[i];
        }
        int [] output = new int[len];
        for( int i = len - 1 ; i >= 0 ; i--){
            output[count[arr[i]/exp%10]-1] = arr[i];
            count[arr[i]/exp%10]--;
        }
        for( int i = 0 ; i < len ; i++){
            arr[i] = output [i];
        }
    }
    public static void rs(int [] arr){
        int len = arr.length;
        int maxlen = arr[0];
        int exp = 1;
        for( int i = 1 ; i < len ; i++){
            if(arr[i]>maxlen)
                maxlen = arr[i];
        }
        maxlen = (int)Math.log10(maxlen)+1;
        while(maxlen>0){
            cs(arr,exp);
            exp = exp*10;
            maxlen--;
        }
    }
}

