package aiassignments;

import java.util.Scanner;

public class TowerOfHanoi {
    void hanoi(int n, char A, char B, char C){
        if(n>=1)
        {
            hanoi(n-1,A,C,B);
            System.out.println(n+" Disk: "+A+" to "+C);
            hanoi(n-1,B,A,C);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disk: ");
        int n = sc.nextInt();
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.hanoi(n,'A','B','C');
    }
}
