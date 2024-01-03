package tree.binarytree;

import other.LinkedList;

public class BinaryTreeDriver {
    public static void Driver(){
        Node root = new Node(10);
        root.left = new Node(40);
        root.right = new Node(50);
        root.left.left = new Node(130);
        root.left.right = new Node(70);
        root.right.left = new Node(90);
        root.right.right = new Node(100);
        root.left.left.left = new Node(80);
        root.right.right.left = new Node(75);
//        Node root = new Node(3);
//        root.left = new Node(1);
//        root.right = new Node(2);
//        root.right.left = new Node(1);
//        root.right.right = new Node(1);
//        System.out.print("Inorder: ");
//        DFS dfs = new DFS();
//        dfs.inorderTraversal(root);
//        System.out.print("Preorder: ");
//        dfs.preorderTraversal(root);
//        System.out.print("Postorder: ");
//        dfs.postorderTraversal(root);
//        Height h = new Height();
//        System.out.println("Height: "+h.height(root));
//        PrintNodeAtDK p = new PrintNodeAtDK();
//        p.pnadk(root,1);
        BFS bfs = new BFS();
        bfs.bfs(root);
        System.out.println();
        System.out.println();
//        SizeOfBinaryTree sobt = new SizeOfBinaryTree();
//        System.out.println("Size: "+sobt.sobt(root));
//        MaximumData md = new MaximumData();
//        System.out.println("Maximum Element: "+md.md(root/*,Integer.MIN_VALUE*/));
//        PrintLeft pl = new PrintLeft();
//        System.out.println("Elements at the left Node: ");
//        pl.printLeft(root);
//        ChildrenSumProperty csp = new ChildrenSumProperty();
//        System.out.println(csp.cSP(root));
//        IsBalencedTree ibt = new IsBalencedTree();
//        System.out.println(ibt.iBT(root));
//        MaxWidth mw = new MaxWidth();
//        System.out.println("Max Width: " + mw.maxWid(root));
        ConvertBTToLL cbtol = new ConvertBTToLL();
//        Node head = cbtol.cBTOL(root);
        cbtol.vcBTOL(root);
        while (cbtol.head.left != null){
            System.out.println(cbtol.head.getKey());
            cbtol.head = cbtol.head.left;
        }
        while (cbtol.head != null){
            System.out.println(cbtol.head.getKey());
            cbtol.head = cbtol.head.right;
        }

    }
}