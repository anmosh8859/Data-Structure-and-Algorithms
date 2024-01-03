package dynamicprogramming;

import java.util.Arrays;

public class MatrixChainMultiplication {
    int mcmRec(int [] arr, int i, int j){
        if(i+1 == j) return 0;
        int res = Integer.MAX_VALUE;
        for(int k = i + 1 ; k < j ; k++)
            res = Math.min(res,(mcmRec(arr, i, k) + mcmRec(arr , k, j) + arr[i] * arr[k] * arr[j]));
        return res;
    }
    int mcmItt(int [] arr){
        int l = arr.length;
        int [][] dpMat = new int[l][l];
        for (int i = 0 ; i < l-1 ; i++)
            dpMat[i][i+1] = 0;

        for (int gap = 2; gap < l; gap++) {
            for(int i = 0 ; i + gap < l ; i++){
                int j = i + gap;
                dpMat[i][j] =  Integer.MAX_VALUE;
                for(int k = i+1 ; k < j ; k++){
                    dpMat[i][j] = Math.min(dpMat[i][j], dpMat[i][k] + dpMat[k][j] + arr[i] * arr[k] * arr[j]);
                }
            }
        }
        for (int i = 0; i < l; i++)
            System.out.println(Arrays.toString(dpMat[i]));
        return dpMat[0][l-1];
    }
    int mcmIttCorman(int [] arr){
        int l = arr.length-1; // l = 3
        int [][] dpMat = new int[l][l];

        for (int i = 0 ; i < l ; i++)
            dpMat[i][i] = 0;

        for (int gap = 1; gap < l; gap++) {
            for(int i = 0 ; i  < l - gap ; i++){

                int j = i + gap;
                dpMat[i][j] =  Integer.MAX_VALUE;

                for(int k = i ; k < j ; k++)
                    dpMat[i][j] = Math.min(dpMat[i][j], dpMat[i][k] + dpMat[k+1][j] + arr[i] * arr[k+1] * arr[j+1]);
            }
        }
        for (int i = 0; i < l; i++) {
            System.out.println(Arrays.toString(dpMat[i]));
        }
        return dpMat[0][l-1];
    }
}
