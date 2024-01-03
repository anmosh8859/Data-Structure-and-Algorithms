package other;

public class MaxAndMin {
    public int [] mam(int [] arr){
        int len  =  arr.length;
        int [] mima = new int[2];
        if(len==1){
            mima[0] = mima[1] = arr[0];
            return mima;
        }
        else if(len%2!=0){
            mima[0] = mima[1] = arr[0];
            for(int i = 1 ; i < len-1 ; i+=2){
                if(arr[i]<arr[i+1]){
                    if(mima[0] > arr[i]) mima[0] = arr[i];
                    if(mima[1] < arr[i+1]) mima[1] = arr[i+1];
                } else {
                    if(mima[0] > arr[i + 1]) mima[0] = arr[i + 1];
                    if(mima[1] < arr[i]) mima[1] = arr[i];
                }
            }
        } else {
            if(arr[0]<arr[1]){
                mima[0] = arr[0];
                mima[1] = arr[1];
            }
            else{
                mima[0] = arr[1];
                mima[1] = arr[0];
            }
            for(int i = 2 ; i < len-1 ; i+=2){
                if(arr[i]<arr[i+1]){
                    if(mima[0] > arr[i]) mima[0] = arr[i];
                    if(mima[1] < arr[i+1]) mima[1] = arr[i+1];
                } else {
                    if(mima[0] > arr[i + 1]) mima[0] = arr[i + 1];
                    if(mima[1] < arr[i]) mima[1] = arr[i];
                }
            }
        }
        return mima;
    }
}
