package Binary_tree;
class Node3{
    int val;
    Node right;
    Node left;
    Node3(int val){
        this.val=val;
    }
}

public class print_nthlevel {
    public static void nthLevel(Node root,int level,int n){
        if(root==null) return;
        if(level==n) System.out.print (root.val+" ");
        nthLevel(root.left,level+1,n);
        nthLevel(root.right,level+1,n);


    }
    public static void main(String[] args) {
        //        2
        //      /   \
        //     3     4
        //    / \   / \
        //   5   6 7   8
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);
        a.right = c;
        a.left = b;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        nthLevel(a,0,2);
    }
}
