package linkedlist;
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;
    private class Node{
        Node prev;
        Node next;
        int data;
        Node(int value){
            this.data = value;
        }
    }
    public void insertFirst(int value){
        Node temp = new Node(value);
        temp.next = head;
        if(head != null) head.prev = temp;
        head = temp;
        size+=1;
        if(tail == null) tail = head;
    }
    public void insertLast(int value){
        Node temp = new Node(value);
        if(tail==null) {
            tail = temp;
            size+=1;
            return;
        }
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void displayReverse(){
        Node temp = tail;
        while(temp!= null){
            System.out.print(temp.data+" -> ");
            temp = temp.prev;
        }
        System.out.println("BEGINNING");
    }
    public void insertAtIndex(int data, int index){
        if(index>=size){
            System.out.println("Index out of Bound...");
            return;
        }
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size-1){
            insertLast(data);
            return;
        }
        Node node = new Node(data);
        Node temp = get(index - 1);
        node.prev = temp;
        node.next = temp.next;
        temp.next= node;
        node.next.prev = node;
        size+=1;
    }
    private Node get(int index){
        if(index<size/2){
            Node temp = head;
            for(int i = 0 ; i < index ; i++){
                temp = temp.next;
            }
            return temp;
        } else{
            Node temp = tail;
            for(int i = size-1 ; i > index ; i--){
                temp = temp.prev;
            }
            return temp;
        }
    }
    public int delete(int index){
        if(index>size-1){
            System.out.println("Index out of Bound...");
            return -1;
        }
        if(index==0) return deleteFirst();
        if(index==size-1) return deleteLast();
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size-=1;
        return temp.data;
    }
    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        head.prev=null;
        size-=1;
        return val;
    }
    public int deleteLast(){
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size-=1;
        return val;
    }
}