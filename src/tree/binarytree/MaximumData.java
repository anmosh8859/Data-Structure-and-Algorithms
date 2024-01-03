package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumData {
//    Another approach...
//    int md(Node root,int max){
//        max = Math.max(root.getKey(), max);
//        if(root==null) return max;
//        if(root.left!=null) max = md(root.left,max);
//        if(root.right!=null) max = md(root.right,max);
//        return max;
//    }


//    Another approach...
//    int md(Node root){
//        if(root == null) return Integer.MIN_VALUE;
//        return Math.max(root.getKey(), Math.max(md(root.left),md(root.right)));
//    }
//    Another approach...
    int md(Node root){
        if(root == null) return 0;
        int max = Integer.MIN_VALUE;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            max = Math.max(curr.getKey(),max);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        return max;
    }
}