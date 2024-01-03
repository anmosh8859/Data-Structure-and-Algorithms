package dynamicprogramming;

public class DPDriver {
    public static void driver(){
        MatrixChainMultiplication mcm = new MatrixChainMultiplication();
        int [] arr = {20, 10, 30, 40, 50};
//        System.out.println(mcm.mcmRec(arr, 0, 3));
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        System.out.println(mcm.mcmRec(arr,0, arr.length-1));
        System.out.println(mcm.mcmIttCorman(arr));
//        String s1 = "AXYZ";
//        String s2 = "BAZ";
//        int lc = lcs.lcsIttDP(s1,s2);
//        System.out.println("Longest Common Subsequence Length: "+lc);
    }
}
