package Binary_tree;

class Node{
    int val;
    Node right;
    Node left;
    Node(int val) {
        this.val = val;
    }

}

public class implemntation {


    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.right);
        display(root.left);

    }
    public static int  size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        int rightSum=sum(root.right);
        int leftSum=sum(root.left);
        return root.val+rightSum+leftSum;

    }
    public static int max(Node root){
        if(root==null) return 0;
        int rightMax =max(root.right);
        int leftMax =max(root.right);
        return Math.max(root.val,Math.max(rightMax,leftMax));
    }
    public static int level(Node root){
        if(root==null) return 0;
        return 1+Math.max(level(root.right),level(root.left));
    }



    public static void main(String[] args) {
        //     1
        //    /  \
        //   2    3
        //  / \  / \
        // 4   5 6  7
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        display(a);
        System.out.println();
        System.out.println("size of the tree is "+size(a));
        System.out.println("sum of the tree is "+sum(a));
        System.out.println("maximum element of the tree is "+max(a));
        System.out.println("levels in the tree is "+level(a));
    }
}
