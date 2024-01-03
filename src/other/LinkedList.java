package other;

public class LinkedList {
    private Node head;
    class Node{
        int data;
        Node next;
        Node (int data)
        {
            this.data=data;
        }
    }
    public void push_head(int n)
    {
        if (head==null)
        {
            Node new_node = new Node(n);
            head=new_node;
            return;
        }
        else{
            Node new_node = new Node(n);
            new_node.next=head;
            head=new_node;
        }
    }
    public int pop_head()
    {
        if(head==null)
        {
            return -1;
        }
        else{
            int temp=head.data;
            head=head.next;
            return temp;
        }
    }
    public void display()
    {
        if (head==null)
        {
            System.out.println("empty!!!");
            return;
        }
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("END");
        }
    }
    public void display_recur(Node head1)
    {
        if(head1==null)
        {
            System.out.print("END");
            return;
        }
        else{
            System.out.println(head1.data+"->");
            display_recur(head1.next);
        }
    }
    public void display_recur()
    {
        display_recur(head);
    }

    public static void main(String[] args) {

    }
}
