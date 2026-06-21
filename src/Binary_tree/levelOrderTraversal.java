package Binary_tree;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.List;

public class levelOrderTraversal {
    public static class Pair{
        TreeNode Node;
        int level;
        Pair(TreeNode Node,int level){
            this.Node=Node;
            this.level=level;
        }
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void display(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
//    public List<List<Integer>> levelOrder(TreeNode root) {
//
//    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10, null, null);
        TreeNode b = new TreeNode(20, null, null);
        TreeNode c = new TreeNode(30, null, null);
        TreeNode d = new TreeNode(40, null, null);
        TreeNode e = new TreeNode(50, null, null);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        display(a);
    }


}
