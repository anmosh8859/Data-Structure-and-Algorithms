package tree.binarytree;

public class PrintNodeAtDK {
    void pnadk(Node root, int dist){
        if(root == null) return;
        else if (dist == 0) System.out.println("Element: "+root.getKey());
        pnadk(root.left, dist-1);
        pnadk(root.right,dist-1);
    }
}