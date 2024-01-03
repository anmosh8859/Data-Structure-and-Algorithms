package tree.binarytree;

public class Node{
    public int getKey() {
        return key;
    }

    private int key;
    protected Node left;
    protected Node right;
    public Node(int k){
        key = k;
    }
}