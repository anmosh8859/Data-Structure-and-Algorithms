package recursion.recurpattern;

public class Triangle {
    static void triangle(int row, int col){
//        if(row==0)
//            return;
//        else if(col<0) {
//            System.out.println();
//            triangle(row - 1, row - 2);
//        }
//        else {
//            System.out.print("*");
//            triangle(row, col-1);
//        }
//        OR
        if(row==0)
            return;
        else if(col<row){
            System.out.print("*");
            triangle(row,col+1);
        } else{
            System.out.println();
            triangle(row-1,0);
        }
    }
    public static void main(String[] args) {
        triangle(4,0);
    }
}
