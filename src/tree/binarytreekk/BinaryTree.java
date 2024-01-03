package tree.binarytreekk;
import java.util.Scanner;
public class BinaryTree {
    public BinaryTree() {}

    private Node root;

    public void populate(Scanner sc){
        System.out.print("Enter the root value: ");
        root = new Node(sc.nextInt());
        populate(sc,root);
    }
    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of " + node.getValue());
        if(sc.nextBoolean()){
            System.out.println("Enter the value of left of " + node.getValue());
            node.setLeft(new Node(sc.nextInt()));
            populate(sc,node.getLeft());
        }

        System.out.println("Do you want to enter right of " + node.getValue());
        if(sc.nextBoolean()){
            System.out.println("Enter the value of right of " + node.getValue());
            node.setRight(new Node(sc.nextInt()));
            populate(sc,node.getRight());
        }
    }

    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent) {
        if(node == null) return;
        System.out.println(indent + node.getValue());
        display(node.getLeft(),indent + "\t");
        display(node.getRight(),indent + "\t");
    }
}
