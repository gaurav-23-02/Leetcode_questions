package Binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
import java.util.Stack;

public class constructStringFromBT {
    public static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static String tree2str(TreeNode root) {
        List<Integer>list = new ArrayList<>();
        Stack<TreeNode>st = new Stack<>();
        Stack<String>st1 = new Stack<>();
        st.push(root);
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            list.add(curr.val);
            st1.push(curr.val+"");
            ans.append(curr.val+"");
            if(curr.right!=null){
                st.push(curr.right);
                ans.append("(");
            }
            if(curr.left!=null){
                st.push(curr.left);
                ans.append(")");
            }
        }
        return ans.toString();
    }
    public static TreeNode buildTree(Integer[]arr){
        if(arr.length==0||arr[0]==null){
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int i=1;
        while(!queue.isEmpty()&&i<arr.length){
            TreeNode curr =queue.poll();
            if(i<arr.length){
                if(arr[i]!=null){
                    curr.left=new TreeNode(arr[i]);
                    queue.add(curr.left);
                }
                i++;
            }
            if(i<arr.length){
                if(arr[i]!=null){
                    curr.right=new TreeNode(arr[i]);
                    queue.add(curr.right);
                }
                i++;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[]root1 = {1,2,3,4};
        TreeNode root = buildTree(root1);
        System.out.println(tree2str(root));
    }
}
