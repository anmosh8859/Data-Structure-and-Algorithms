package collection;
import java.util.LinkedList;
public class HashMapImplementation {
    static class HashMap<K,V>{
       private class Node{
           K key;
           V value;
           public Node(K key, V value){
               this.key = key;
               this.value = value;
           }
       }

       private int n;
       private int N;
       private LinkedList<Node> buckets[];

       @SuppressWarnings("unchecked")
        public HashMap(){
           this.N = 4;
           this.buckets = new LinkedList[4];
           for (int i = 0; i < 4; i++) {
               this.buckets[i] = new LinkedList<>();
           }
       }
       public void put(K key, V value){

       }
       public boolean containsKey(K key){
           return false;
       }
    }
}
