package other;
import java.util.*;
public class Huffman {
    static class Node{
        int freq;
        char ch;
        Node left;
        Node right;
    }
    static class CompareAccordingFrequency implements Comparator<Node> {
        public int compare(Node p, Node q){
            return p.freq - q.freq;
        }
    }
    static void prinCode(Node root, String s) {
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " : " + s);
            return;
        }
        prinCode(root.left, s + "0");
        prinCode(root.right, s + "1");
    }
}