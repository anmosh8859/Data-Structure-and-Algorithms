package other;

import java.util.Arrays;

public class LongestCommonSequence {
    void lcsAlgo(char [] s1, char [] s2, int m, int n){
        int [][] lcstable = new int[m+1][n+1];
        for(int i = 0 ; i <= m ; i++){
            for(int j = 0 ; j <= n ; j++){
                if(i == 0 || j==0) lcstable[i][j] = 0;
                else if(s1[i-1] == s2[j-1])
                    lcstable[i][j] = lcstable[i-1][j-1]+1;
                else lcstable[i][j] = Math.max(lcstable[i - 1][j],lcstable[i][j - 1]);
            }
        }
        int index = lcstable[m][n];
        char [] lcsAlg = new char[index+1];
        lcsAlg[index] = '\0';
        int i = m, j = n;
        while (i > 0 && j > 0){
            if(s1[i - 1] == s2[j - 1]){
                lcsAlg[index - 1] = s1[i -1];
                i--;
                j--;
                index--;
            }
            else if(lcstable[i - 1][j] > lcstable[i][j - 1]) i--;
            else j--;
        }
    }
}
