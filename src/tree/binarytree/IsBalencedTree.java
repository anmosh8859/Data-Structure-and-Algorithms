package tree.binarytree;
public class IsBalencedTree {
//    boolean iBT(Node root){
//        if(root == null) return true;
//        int lh = height(root.left);
//        int rh = height(root.right);
//        return (Math.abs(lh-rh)<=1 && iBT(root.left) && iBT(root.right));
//    }
//
//    private int height(Node root) {
//        if(root == null) return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }

//    efficient solution...
    int iBT(Node root){
        if(root == null) return 0;
        int lh = iBT(root.left);
        if(lh == -1) return -1;
        int rh = iBT(root.right);
        if(rh == -1) return -1;
        if(Math.abs(lh - rh)>1) return -1;
        else return Math.max(lh,rh) + 1;
    }
}