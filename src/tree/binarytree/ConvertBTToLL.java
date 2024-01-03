package tree.binarytree;
public class ConvertBTToLL {
    Node prev = null, head = null;
    Node cBTOL(Node root){
        if(root == null) return root;
        Node head = cBTOL(root.left);
        if(prev == null) head = root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        cBTOL(root.right);
        return head;
    }
    void vcBTOL(Node root){
        if(root == null) return;
        vcBTOL(root.left);
        if(prev == null) head = root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        vcBTOL(root.right);
    }
}