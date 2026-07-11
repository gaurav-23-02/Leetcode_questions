package Binary_tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class allElementInTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static List<Integer> getAllElements(TreeNode root1,TreeNode root2){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root1);
        st2.push(root2);
        while(!st1.empty()){
            TreeNode curr = st1.pop();
            list.add(curr.val);
            if(curr.left!=null)st1.push(curr.left);
            if(curr.right!=null)st1.push(curr.right);
        }
        while(!st2.empty()){
            TreeNode curr = st2.pop();
            list.add(curr.val);
            if(curr.left!=null)st2.push(curr.left);
            if(curr.right!=null)st2.push(curr.right);
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(4);
        root1.right=b;
        root1.left=a;
        TreeNode root2 = new TreeNode(1);
        TreeNode c = new TreeNode(0);
        TreeNode d = new TreeNode(3);
        root2.right=d;
        root2.left=c;
        System.out.println(getAllElements(root1,root2));
    }
}
