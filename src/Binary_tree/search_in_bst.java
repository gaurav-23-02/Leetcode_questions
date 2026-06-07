package Binary_tree;
class Node4{
    int val;
    Node right;
    Node left;
    Node4(int val){
        this.val=val;
    }
}

public class search_in_bst {
    public static void search(Node root){

    }
    public static void main(String[] args) {
        //        5
        //      /   \
        //     3     7
        //    / \   / \
        //   2   4 6   8
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(6);
        Node g = new Node(8);
        a.right = c;
        a.left = b;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
    }
}
