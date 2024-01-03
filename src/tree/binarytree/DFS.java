package tree.binarytree;

public class DFS {
    void inorderTraversal(Node root){
        if(root != null){
            inorderTraversal(root.left);
            System.out.println(root.getKey());
            inorderTraversal(root.right);
        }
    }
    void preorderTraversal(Node root){
        if(root != null){
            System.out.println(root.getKey());
            inorderTraversal(root.left);
            inorderTraversal(root.right);
        }
    }
    void postorderTraversal(Node root){
        if(root != null){
            inorderTraversal(root.left);
            inorderTraversal(root.right);
            System.out.println(root.getKey());
        }
    }
}