package Binary_tree;

import java.util.*;

public class deepestLevelSum {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    static int deepestLevelSum1(TreeNode root){
        List<List<Integer>>ans = new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
                level.add(curr.val);
            }
            ans.add(level);
        }
        int n=ans.get(ans.size()-1).size();
        int[]lastLevel=new int[n];
        int idx=0;
        for(int x:ans.get(ans.size()-1)){
            lastLevel[idx++]=x;
        }
        System.out.println(Arrays.toString(lastLevel));
        int sum=0;
        for(int x:lastLevel){
            sum+=x;
        }
        return sum;
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
        Integer[]arr={1,2,3,4,5,null,6,7,null,null,null,null,8};
        TreeNode root = buildTree(arr);
        System.out.println(deepestLevelSum1(root));
    }

}
