package Binary_tree;

import java.util.*;
import java.util.Queue;

public class bfs_ListOfLists {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static List<Integer> iterativeTraversal(TreeNode root){
        List<Integer>list=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            list.add(curr.val);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        return list;
    }
    public static List<Integer> bfs(TreeNode root){
        List<List<Integer>>ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer>list = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            list.add(curr.val);
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
        return list;
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
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
        }return ans;
    }
    public static TreeNode buildTree(Integer[]arr){
        if(arr.length==0||arr[0]==null){
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode>queue=new LinkedList<>();
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
        Integer[]arr={3,9,20,5,8,15,7};
        TreeNode root = buildTree(arr);
        System.out.println("InOrder Traversal of Tree:");
        System.out.println(iterativeTraversal(root));
        System.out.println("Level Order Traversal of Tree: ");
        System.out.println(bfs(root));
        System.out.println("Modified LEVEL order Traversal: ");
        System.out.println(levelOrder(root));
    }
}
