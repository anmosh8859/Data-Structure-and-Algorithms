package linkedlist;
public class LL{
    public ListNode getHead() {
        return head;
    }

    private ListNode head;
    private ListNode tail;

    public int getHeadData() {
        return head.data;
    }

    public int getTailData() {
        return tail.data;
    }

    public int getSize() {
        return size;
    }

    private int size;
    LL(){
        this.size = 0;
    }
    private class ListNode {
        public int getData() {
            return data;
        }

        private int data;
        private ListNode next;
        public ListNode(int value) {
            this.data = value;
        }
        public ListNode(int value, ListNode next){
            this.data = value;
            this.next = next;
        }
    }
    public void insertFirst(int value){
        ListNode temp = new ListNode(value);
        temp.next = head;
        head = temp;
        size+=1;
        if(tail==null) {
            tail = head;
        }
    }
    //insert using recursion...
    public void insertAtIndexRec(int value, int index){
        head = insertAtIndexRec(value,index,head);
    }
    private ListNode insertAtIndexRec(int value, int index, ListNode listNode){
        if(index==0){
            ListNode temp = new ListNode(value, listNode);
            size++;
            return temp;
        }
        listNode.next = insertAtIndexRec(value, --index, listNode.next);
//        System.out.println(node.data);
        return listNode;
    }
    public void insertAtIndex(int value, int index){
        if(index>size-1){
            System.out.println("IndexOutOfBound...");
            return;
        }
        else if(index == 0){
            insertFirst(value);
            size++;
        } else if(index == size){
            insertFirst(value);
            size++;
        } else{
            ListNode temp = head;
            for(int i = 1 ; i < index ; i++){
                temp = temp.next;
            }
            temp.next = new ListNode(value,temp.next);
            size++;
        }
    }
    public void insertLast(int value){
        ListNode temp = new ListNode(value);
        if(tail == null){
            tail = temp;
            head = tail;
            size+=1;
            return;
        }
        tail.next = temp;
        tail = temp;
        size+=1;
    }
    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head == null) tail = null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0) return deleteFirst();
        ListNode temp = get(index-1);
        ListNode del = temp.next;
        temp.next = del.next;
        size--;
        return del.data;
    }
    public ListNode find(int value){
        ListNode listNode = head;
        while(listNode !=null){
            if(listNode.data==value) return listNode;
            listNode.next = listNode;
        }
        return listNode;
    }
    public ListNode get(int index){
        ListNode temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp;
    }
    public void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
//    public void bubbleSortList(){
//        bubbleSortList(head, head.next, tail);
//    }
//    public void bubbleSortList(Node first, Node second, Node tail){
//        Node prev = first;
//        if(second == tail){
//            return;
//        }
//        if (first.data > second.data){
//            if(first == head){
//                head = first;
//                first.next = second.next;
//                second.next = first.next;
//            } else if (second == tail) {
//                prev.next = second;
//                tail = first;
//                first.next = null;
//                second.next = tail;
//            } else {
//                prev.next = second;
//                first.next = second.next;
//                second.next = first;
//                prev = prev.next;
//            }
//            bubbleSortList(first.next, second.next, tail);
//        }
//        else bubbleSortList(head, head.next, second);
//    }
    public void revHeadTail(ListNode listNode){
        if(listNode == tail){
            head = tail;
            return;
        }
        revHeadTail(listNode.next);
        tail.next = listNode;
        tail = listNode;
        tail.next = null;
    }
    public void reverseRecWithHead(){
        reverseRecWithHead(head,null);
    }
    private ListNode reverseRecWithHead(ListNode head, ListNode listNode){
        ListNode temp = last(head);
        if(temp == head){
            listNode.next = temp;
            temp.next = null;
            return listNode;
        }
        if(listNode == null){
            listNode = reverseRecWithHead(head, temp);
            this.head = listNode;
            return listNode;
        }
        listNode.next = reverseRecWithHead(head, temp);
        return listNode;
    }
    ListNode last(ListNode listNode){
        if(listNode == null) return null;
        else if(listNode.next == null){
            ListNode temp = listNode;
            head = null;
            return temp;
        }
        else if(listNode.next.next == null){
            ListNode temp = listNode.next;
            listNode.next = null;
            return temp;
        }
        else return last(listNode.next);
    }
    public void reverse(){
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null) next = next.next;
        }
        head = prev;
    }
    void reversePart(int left, int right){
        if(head == null || head.next == null) return;
        ListNode head1;
        ListNode prev;
        ListNode present;
        ListNode next;
        if(left==0) {
            head1 = get(left);
            prev = null;
            present = head1;
            next = head1.next;
        }
        else {
            head1 = get(left-1);
            prev = head1;
            present = head1.next;
        }
        ListNode headNext = head1.next;
        ListNode tail = get(right);
        present = head1;
        next = head1.next;
        ListNode temp = tail.next;
        while(present != temp){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null) next = next.next;
        }
        head1.next = tail.next;
        if(left == 0) {
            this.head = tail;
            head1.next = temp;
        }
        else{
            head1.next = tail;
            headNext.next = temp;
        }
    }
    void show(ListNode head){
        ListNode listNode = last(head);
        if(head != null) System.out.println("Redeemed Data: "+ listNode.data);
        else System.out.println("NULL");
        display();
    }
}