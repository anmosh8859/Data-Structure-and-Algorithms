package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeft {
//    int maxLevel = 0;
//    void printLeft(Node root){
//        printLeft(root,1);
//    }
//    void printLeft(Node root, int level){
//        if(root == null) return;
//        if(maxLevel<level) {
//            System.out.println(root.getKey());
//            maxLevel = level;
//        }
//        printLeft(root.left,level+1);
//        printLeft(root.right,level+1);
//    }
//    Another approach...
    void printLeft(Node root){
        if(root==null) return;
        Queue<Node> q =new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if(i==0) System.out.println(curr.getKey());
                if(curr.left!=null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
    }
}
