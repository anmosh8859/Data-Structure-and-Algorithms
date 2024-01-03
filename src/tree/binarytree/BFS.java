package tree.binarytree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
//    void bfs(Node root){
//        if(root == null){
//            System.out.println("Not a single Node is present...");
//            return;
//        }
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty()){
//            Node curr = q.poll();
//            System.out.println(curr.getKey()+" ");
//            if(curr.left!= null) q.add(curr.left);
//            if(curr.right!=null) q.add(curr.right);
//        }
//    }


//    Another approach...
//    Queue<Node> q = new LinkedList<>();
//    void bfs(Node root){
//        if(root!=null){
//            System.out.println(root.getKey()+" ");
//            this.q.add(root.left);
//            this.q.add(root.right);
//            bfs(q.remove());
//        }
//    }


//    Another approach...
//    private int height(Node root){
//        if(root == null) return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }
//    private void printAtH(Node root, int h){
//        if(root == null) return;
//        if(h == 0) System.out.print(root.getKey()+" ");
//        printAtH(root.left,h-1);
//        printAtH(root.right,h-1);
//    }
//    public void bfs(Node root){
//        int h = height(root);
//        for(int i = 0 ; i < h ; i++){
//            printAtH(root,i);
//            System.out.println();
//        }
//    }

//    line by line Traversal
    void bfs(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (q.size()>1){
            Node curr = q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.getKey()+" ");
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
    }
}