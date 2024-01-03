package sorting;
import java.util.Arrays;
public class Driver {
    public static void driver(){
//        int [] arr = {314,256,897,4158,4672};
        int [] arr = {1,2,1,1,2,3,4,5,2,1};
//        CountingSort cs = new CountingSort();
//        cs.cs(arr);
//        System.out.println(Arrays.toString(arr));
//        InsertionSort is = new InsertionSort();
//        is.is(arr);
        HeapSortCorman hsc = new HeapSortCorman();
        hsc.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
