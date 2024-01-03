package tree.binarytreekk;

import java.util.Scanner;

public class BinarySearchTree {
    private Node root;

    public int height(Node node){
        if(node == null) return -1;
        return node.getHeight();
    }
    public void populate(Scanner sc){
        if(root == null){
            System.out.println("Enter the value to enter in root: ");
            root = new Node(sc.nextInt());
            populate(sc);
        }
        System.out.println("Do you want to enter an element?");
        if(sc.nextBoolean()){
            System.out.println("Enter the element: ");
            insertNode(sc.nextInt(), root);
            populate(sc);
        }
    }
    public void insertNode(int value, Node node){
        if(value <= node.getValue()){
            if(node.getLeft()!=null) insertNode(value,node.getLeft());
            else node.setLeft(new Node(value));
        }
        else {
            if(node.getRight()!=null) insertNode(value,node.getRight());
            else node.setRight(new Node(value));
        }
        node.setHeight(Math.max(height(node.getLeft()),height(node.getRight()))+1);
    }

    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent) {
        if(node == null) return;
        System.out.println(indent + node.getValue() + " height of " + node.getValue() + ": " + node.getHeight());
        display(node.getLeft(),indent + "\t");
        display(node.getRight(),indent + "\t");
    }
}
