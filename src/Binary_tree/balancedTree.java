package Binary_tree;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class balancedTree {
//    public boolean isBalanced(TreeNode root) {
//        if()
//    }
    public static int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.right),level(root.left));
    }
    public static  void display(TreeNode root){
        if(root==null)return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        display(root);
        System.out.println();
        System.out.println("Levels : "+level(root));
    }
}
