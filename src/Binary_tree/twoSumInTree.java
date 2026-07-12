package Binary_tree;

import java.util.*;

public class twoSumInTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    static boolean twoSumTree(TreeNode root,int k){
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            ans.add(curr.val);
            if(curr.left!=null)st.push(curr.left);
            if(curr.right!=null)st.push(curr.right);
        }
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.size();j++){
                if(ans.get(i)+ans.get(j)==k){
                    return true;
                }
            }
        }
        return false;
    }
    static TreeNode buildTree(Integer[]arr){
        if(arr.length==0||arr[0]==null){
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue=new LinkedList<>();
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
        Integer[]arr={5,3,6,2,4,null,7};
        TreeNode root = buildTree(arr);
        System.out.println(twoSumTree(root,9));
    }

}
