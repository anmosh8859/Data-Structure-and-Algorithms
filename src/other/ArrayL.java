package other;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayL {
    public static void arrLOp(){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arrL = new ArrayList<>();
        arrL.add(25);
        System.out.println(arrL);
        ArrayList < ArrayList<Integer> > mul= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            mul.add(new ArrayList<Integer>());
        }
//        System.out.println(mul);
//        System.out.println(mul.size());
        for (int i = 0; i < mul.size(); i++) {
            for (int j = 0; j < 4; j++) {
                mul.get(i).add(sc.nextInt());
            }
        }
        System.out.println(mul);
    }
}
