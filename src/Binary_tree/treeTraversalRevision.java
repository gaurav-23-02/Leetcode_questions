package Binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class treeTraversalRevision {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static List<List<Integer>> bfs(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode>q =  new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer>level = new ArrayList<>();
            int levelSize = q.size();
            for(int i=0;i<levelSize;i++){
                TreeNode curr = q.poll();
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                level.add(curr.val);
            }
            ans.add(level);
        }
        return ans;
    }
    public static TreeNode buildTree(int[]nums){
        if(nums.length==0||nums[0]==-1){
            return null;
        }
        Queue<TreeNode>q=new LinkedList<>();
        TreeNode root = new TreeNode(nums[0]);
        int i=1;
        q.add(root);
        while(!q.isEmpty()&&i<nums.length){
            TreeNode curr  = q.poll();
            if(i<nums.length){
                if(nums[i]!=-1){
                    curr.left=new TreeNode(nums[i]);
                    q.add(curr.left);
                }
                i++;
            }
            if(i<nums.length){
                if(nums[i]!=-1){
                    curr.right=new TreeNode(nums[i]);
                    q.add(curr.right);
                }
                i++;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,-1};
        TreeNode root = buildTree(nums);
        System.out.println(bfs(root));
    }
}
