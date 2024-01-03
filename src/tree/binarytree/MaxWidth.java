package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    int maxWid(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        while (!q.isEmpty()){
            int count = q.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                Node temp = q.poll();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        return res;
    }
}
