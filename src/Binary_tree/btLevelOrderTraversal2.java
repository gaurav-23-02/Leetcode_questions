package Binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class btLevelOrderTraversal2 {
    public static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
            right=left=null;
        }
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode>q = new LinkedList<>();
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
        List<List<Integer>>ans1 = new ArrayList<>();
        for(int i=ans.size()-1;i>=0;i--){
            ans1.add(ans.get(i));
        }
        return ans1;
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
        Integer[]root1 = {3,9,20,null,null,15,7};
        TreeNode root =buildTree(root1);
        System.out.println(levelOrderBottom(root));
    }
}
