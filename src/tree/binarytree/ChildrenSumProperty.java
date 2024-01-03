package tree.binarytree;

public class ChildrenSumProperty {
    boolean cSP(Node root){
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        int sum = 0;
        if(root.left != null){
            if(!cSP(root.left)) return false;
            sum+=root.left.getKey();
        }
        if(root.right != null) {
            if(!cSP(root.right)) return false;
            sum+=root.right.getKey();
        }
        if(sum == root.getKey()) return true;
        return false;
    }
}
