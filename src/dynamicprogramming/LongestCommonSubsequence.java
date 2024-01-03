package dynamicprogramming;

public class LongestCommonSubsequence {
    int [][] memo = new int[5][4];
    LongestCommonSubsequence(){
        for(int i = 0 ; i < 5 ; i++){
            for (int j = 0; j < 4; j++) {
                memo[i][j]= -1;
            }
        }
    }
    int lcsDP(String s1, String s2, int l1, int l2){
        if(memo[l1+1][l2+1] != -1) return memo[l1+1][l2+1];
        else {
            if (l1 == -1 || l2 == -1) memo[l1 + 1][l2 + 1] = 0;
            else {
                if (s1.charAt(l1) == s2.charAt(l2)) {
                    memo[l1 + 1][l2 + 1] = 1 + (lcsDP(s1, s2, l1 - 1, l2 - 1));
                }
                else memo[l1 + 1][l2 + 1] = Math.max(lcsDP(s1, s2, l1 - 1, l2), lcsDP(s1, s2, l1, l2 - 1));
            }
            return memo[l1 + 1][l2 + 1];
        }
    }
//    Wrong Approach:::
//    int lcsDP(String s1, String s2, int l1, int l2){
//        if(memo[l1+1][l2+1] != -1) return memo[l1+1][l2+1];
//        if (l1 == -1 || l2 == -1) {
//            memo[l1 + 1][l2 + 1] = 0;
//            return memo[l1 + 1][l2 + 1];
//        }
//        if (s1.charAt(l1) == s2.charAt(l2))
//            memo[l1 + 1][l2 + 1] = 1 + (lcsDP(s1, s2, l1 - 1, l2 - 1));
//        memo[l1 + 1][l2 + 1] = Math.max(lcsDP(s1, s2, l1 - 1, l2), lcsDP(s1, s2, l1, l2 - 1));
//        return memo[l1 + 1][l2 + 1];
//    }
    int lcs(String s1, String s2, int l1, int l2){
        if(l1 == -1 || l2 == -1) return 0;
        if(s1.charAt(l1)==s2.charAt(l2)) return (1 + lcs(s1,s2,l1-1,l2-1));
        return Math.max(lcs(s1,s2,l1-1,l2),lcs(s1,s2,l1,l2-1));
    }
    int lcsIttDP(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int [][] dpMat = new int[l1][l2];
        for(int i = 0 ; i < l1 ; i++)
            dpMat[i][0] = 0;

        for(int i = 0 ; i < l2 ; i++)
            dpMat[0][i] = 0;

        for(int i = 1 ; i < l1 ; i++){
            for (int j = 1; j < l2; j++) {
                if(s1.charAt(i) == s1.charAt(j)) dpMat[i][j] = 1 + dpMat[i-1][j-1];
                else dpMat[i][j] = Math.max(dpMat[i][j-1],dpMat[i-1][j]);
            }
        }
        return dpMat[l1-1][l2-1];
    }
}
