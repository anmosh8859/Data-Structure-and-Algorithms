package tree.binarytreekk;

public class BSTKunal {
    private Node root;
    public int height(Node node){
        if(node == null) return -1;
        return node.getHeight();
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int value){
        root = insert(value, root);
    }

    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.getValue()) node.setLeft(insert(value,node.getLeft()));

        if(value > node.getValue()) node.setRight(insert(value,node.getRight()));

        node.setHeight(Math.max(height(node.getLeft()),height(node.getRight()))+1);

        return node;
    }

    public void populate(int [] nums){
        for(int i: nums) insert(i);
    }
    public boolean balanced(Node node){
        if(node == null) return true;

        return Math.abs(height(node.getLeft()) - height(node.getRight())) <=1 && balanced(node.getLeft()) && balanced(node.getRight());
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if(node == null) return;

        System.out.println(details + node.getValue());
        display(node.getLeft(), "Left Child of " + node.getValue() + ": ");
        display(node.getRight(), "Right child of " + node.getValue() + ": ");
    }
}
