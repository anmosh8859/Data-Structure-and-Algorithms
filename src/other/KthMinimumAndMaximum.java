package other;

public class KthMinimumAndMaximum {
    int partitionMin(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int  j = low ; j < high ; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i+1] = temp;
       return i+1;
    }
    int partitionMax(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int  j = low ; j < high ; j++){
            if(arr[j]>=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i+1] = temp;
        return i+1;
    }
    int selectMin(int [] arr, int low, int high, int kth){
        if(low==high)
            return arr[low];
        int pivot = partitionMin(arr,low,high);
        int k = pivot - low + 1;
        if(kth == k) return arr[pivot];
        else if (kth < k) return selectMin(arr, low, pivot-1,kth);
        else return selectMin(arr, pivot + 1, high, kth - k);
    }
    int selectMax(int [] arr, int low, int high, int kth){
        if(low==high)
            return arr[low];
        int pivot = partitionMax(arr,low,high);
        int k = pivot - low + 1;
        if(kth == k) return arr[pivot];
        else if (kth < k) return selectMax(arr, low, pivot-1,kth);
        else return selectMax(arr, pivot + 1, high, kth - k);
    }
//    int selectMin(int [] A, int p, int r, int i){
//        int q = partition(A,p,r);
//        int k = q - p + 1;
//        if(i == k) return A[q];
//        else if (i < k) return selectMin(A,p,q-1,i);
//        else return selectMin(A, q + 1, r, i - k);
//    }
}