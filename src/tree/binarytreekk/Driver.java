package tree.binarytreekk;

import java.util.Scanner;

public class Driver {
    public static void driver(){
        Scanner sc = new Scanner(System.in);
//        BinaryTree bt = new BinaryTree();
//        bt.populate(sc);
//        bt.display();
        BinarySearchTree bst = new BinarySearchTree();
        bst.populate(sc);
        bst.display();
//        BSTKunal bstk = new BSTKunal();
//        int [] nums = {5,2,7,1,4,6,9,8,3,10};
//        bstk.populate(nums);
//        bstk.display();
    }
}
