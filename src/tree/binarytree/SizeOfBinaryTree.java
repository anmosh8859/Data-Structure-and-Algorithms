package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {
    int sobt(Node root){
        if(root==null) return 0;
        return sobt(root.left) + sobt(root.right) + 1;
    }


//    Another approach...
//    int md(Node root){
//        if(root == null) return 0;
//        int size = 1;
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty()){
//            Node curr = q.poll();
//            if(curr.left != null) {
//                q.add(curr.left);
//                size+=1;
//            }
//            if(curr.right != null){
//                q.add(curr.right);
//                size+=1;
//            }
//        }
//        return size;
//    }
}
