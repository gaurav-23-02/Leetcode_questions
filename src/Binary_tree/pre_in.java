package Binary_tree;


class Node1 {
    int val;
    Binary_tree.Node1 right;
    Binary_tree.Node1 left;

    Node1(int val) {
        this.val = val;
    }
}
public class pre_in {
    public static void preorder(Node1 root){
        if(root==null) return ;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node1 root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }
    public static void postorder(Node1 root){
        if(root==null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");

    }

    public static void main(String[] args) {
        //     1
        //    /  \
        //   2    3
        //  / \  / \
        // 4   5 6  7
        Node1 a= new Node1(1);
        Binary_tree.Node1 b=new Binary_tree.Node1(2);
        Binary_tree.Node1 c=new Binary_tree.Node1(3);
        Binary_tree.Node1 d=new Binary_tree.Node1(4);
        Binary_tree.Node1 e=new Binary_tree.Node1(5);
        Binary_tree.Node1 f=new Binary_tree.Node1(6);
        Binary_tree.Node1 g=new Binary_tree.Node1(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);

    }

}
