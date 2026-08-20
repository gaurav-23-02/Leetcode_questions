package TwoDArray;

import com.sun.source.tree.Tree;

import java.util.*;

public class lastLeveLsum {
    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static List<Integer> preOrder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            ans.add(curr.val);
            if (curr.left != null) st.push(curr.left);
            if (curr.right != null) st.push(curr.right);
        }
        return ans;
    }
    public static List<Integer> bfs1(TreeNode root){
        List<Integer>ans = new ArrayList<>();
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            for(int i=0;i<levelSize;i++){
                TreeNode curr = q.poll();
                ans.add(curr.val);
                if(curr.right!=null)q.add(curr.right);
                if(curr.left!=null)q.add(curr.left);
            }
        }
        return ans;
    }
    public static List<List<Integer>> bfs(TreeNode root){
        List<List<Integer>>ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer>level = new ArrayList<>();
            int levelSize = q.size();
            for(int i=0;i<levelSize;i++){
                TreeNode curr = q.poll();
                level.add(curr.val);
                if(curr.right!=null)q.add(curr.right);
                if(curr.left!=null)q.add(curr.left);
            }
            ans.add(level);
        }
        return ans;
    }

    public static TreeNode buildTree(int[]nums){
        if(nums==null||nums.length==0||nums[0]==-1){
            return null;
        }
        Queue<TreeNode>q = new LinkedList<>();
        TreeNode root = new TreeNode(nums[0]);
        q.add(root);
        int i=1;
        while(i< nums.length){
            TreeNode curr = q.poll();
            if(i<nums.length){
                if(nums[i]!=-1){
                    curr.right=new TreeNode(nums[i]);
                    q.add(curr.right);
                }
                i++;
            }
            if(i<nums.length){
                if(nums[i]!=-1){
                    curr.left=new TreeNode(nums[i]);
                    q.add(curr.left);
                }
                i++;
            }
        }return root;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,-1,4,6,7};
        TreeNode root = buildTree(nums);
        System.out.println(preOrder(root));
        System.out.println(bfs(root));
        System.out.println(bfs1(root));
    }
}
