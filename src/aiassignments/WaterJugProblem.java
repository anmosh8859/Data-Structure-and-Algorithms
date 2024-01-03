package aiassignments;

import java.io.*;
import java.util.Scanner;
class WaterJugProblem {

    public static int getGCD(int x, int y) {
        if (y == 0) {
            return x;
        }

        return getGCD(y, x % y);
    }

    public static int pourWater(int fromCapacity, int toCapacity, int d) {

        int fromCap = fromCapacity;
        int toCap = 0;

        int reqStep = 1;

        while (fromCap != d && toCap != d) {

            int maxPaur = Math.min(fromCap, toCapacity - toCap);

            toCap = toCap + maxPaur;
            fromCap = fromCap - maxPaur;

            reqStep++;

            if (fromCap == d || toCap == d)
                break;

            if (fromCap == 0) {
                fromCap = fromCapacity;
                reqStep++;
            }

            if (toCap == toCapacity) {
                toCap = 0;
                reqStep++;
            }
        }
        return reqStep;
    }

    public static int findMinSteps(int i, int j, int d) {

        if (i > j) {
            int temp = i;
            i = j;
            j = i;
        }

        if (d > j) {
            return -1;
        }

        if ((d % getGCD(j, i)) != 0)
            return -1;


        return Math.min(pourWater(j, i, d),
                pourWater(i, j, d));
    }

    public static void main(String[] args) {

        int i, j, d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Jug1 in liters");
        i = sc.nextInt();

        System.out.println("Enter the size of Jug2 in liters");
        j = sc.nextInt();

        System.out.println("Enter the amount of water which you want to messure:");
        d = sc.nextInt();

        sc.close();

        System.out.println("Minimum number of steps required to messure water is " + findMinSteps(i, j, d));
    }
}
