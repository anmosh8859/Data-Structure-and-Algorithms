package backtracking;

import java.util.Arrays;

public class NQueen {
    int nQueen(boolean [][] board, int row){
        int n = board.length;
        if(row == n){
            displayBoard(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int col = 0 ; col < n ; col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count+= nQueen(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private boolean isSafe(boolean[][] board, int row, int col) {
        for(int i = 0 ; i < row ; i++){
            if(board[i][col]) return false;
        }






        int min = Math.min(row,col);
        for(int i = 0 ; i <= min ; i++){
            if(board[row - i][col - i]) return false;
        }


        min = Math.min(row, board.length - col - 1);
        for(int i = 0 ; i <= min ; i++){
            if(board[row - i][col + i]) return false;
        }

        return true;
    }

    void displayBoard(boolean [][] board){
        for(boolean [] arr: board){
            for(boolean element: arr){
                if(element==false) System.out.print("X ");
                else System.out.print("Q ");
            }
            System.out.println();
        }
    }
}