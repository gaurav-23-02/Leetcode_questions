package Binary_tree;

import java.util.*;

public class rootArrayInput {
     static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static TreeNode buildTree(Integer[]arr){
         if(arr.length==0||arr[0]==null)return null;
         TreeNode root = new TreeNode(arr[0]);
         Queue<TreeNode>queue=new LinkedList<>();
         queue.add(root);
         int i=1;
         while(!queue.isEmpty()&&i<arr.length){
             TreeNode curr = queue.poll();
             if(i<arr.length){
                 if(arr[i]!=null){
                     curr.left=new TreeNode(arr[i]);
                     queue.add(curr.left);
                 }
                 i++;
             }
             if (i < arr.length) {
                 if (arr[i] != null) {
                     curr.right = new TreeNode(arr[i]);
                     queue.add(curr.right);
                 }
                 i++;
             }
         }
         return root;
    }
    public static List<Integer> traverseIterative(TreeNode root){
        List<Integer>ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.empty()){
            TreeNode curr = st.pop();
            ans.add(curr.val);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        return ans;
    }

    public static void main(String[] args) {
        Integer[]arr={5,8,9,2,1,3,7,null,null,4,6};
        TreeNode root = buildTree(arr);
        System.out.println(traverseIterative(root));
    }

}
