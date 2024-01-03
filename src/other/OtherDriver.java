package other;

import java.util.Arrays;

public class OtherDriver {
    public static void otherDriver(){
//        int [] arr = {2,5,40,60,10,30,42,14,96,0,-1};
//        int [] arr = {5,4,6,1};
//         MaxAndMin mam = new MaxAndMin();
//         int [] res = mam.mam(arr);
//         System.out.println(Arrays.toString(res));
//        KthMinimumAndMaximum km = new KthMinimumAndMaximum();
//        km.partition(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
//        int k = km.selectMin(arr, 0, arr.length - 1, 6);
//        System.out.println(k);
//        int l = km.selectMax(arr,0, arr.length - 1,6);
//        int l = km.partitionMax(arr, 0 ,arr.length - 1);
//        System.out.println(l);
//        LongestCommonSequence lcs = new LongestCommonSequence();
//        char [] s1 = {'A','B','C','D','E'};
//        char [] s2 = {'F', 'G', 'H', 'I', 'J'};
//        lcs.lcsAlgo(s1,s2,s1.length,s2.length );
//        String [] strarr = {" a"," a"," a"};
//        LCP lcp = new LCP();
//        System.out.println(lcp.lCP(strarr));
//        String s = "this is string test";
//        char deli = 's';
//        StringSplit ss = new StringSplit();
//        System.out.println(Arrays.toString(ss.stringSplit(s,deli)));
        int [] arr = {1,2,1,1,2,3,4,5,2,1,5,5,5,5,5,5,5,5,5};
        int[] out = {1,1,1,1,2,2,2,3,4,5};
        ArrayFreqSort afs = new ArrayFreqSort();
        System.out.println(Arrays.toString(afs.aFS(arr)));
    }

}