package Binary_tree;

import java.util.*;

public class bottomLeftTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
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
    public static int findBottomLeftValue(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
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
        System.out.println(ans);
        int x = ans.get(ans.size()-1).get(0);
        return x;
    }

    public static void main(String[] args) {
        Integer []root1 = {1,2,3,4,null,5,6,null,null,7};
        TreeNode root =  buildTree(root1);
        System.out.println(findBottomLeftValue(root));
    }
}
