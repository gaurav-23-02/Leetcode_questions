package Binary_tree;

import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class KthSmallestSumBT {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static List<Integer> iterative(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        List<Integer>list=new ArrayList<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            list.add(curr.val);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        return list;
    }
    public  static List<Integer> maxLevelSum(TreeNode root, int k){
        List<Integer>list=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int levelMax=0;
            int levelSize = q.size();
            for(int i=0;i<levelSize;i++){
                TreeNode curr = q.poll();
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                levelMax =Math.max(levelMax,curr.val);
            }
            list.add(levelMax);
        }
        return list;
    }
    public static int getMin(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        List<Integer>list=new ArrayList<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            list.add(curr.val);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        int n= list.size();
        Collections.sort(list);
        return Math.abs(list.get(n-2)-list.get(n-1));
    }
    public static TreeNode buildTree(Integer[]arr){
        if(arr.length==0||arr[0]==null)return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i=1;
        while(!queue.isEmpty()&&i<arr.length){
            TreeNode curr = queue.poll();
            if(i<arr.length){
                if(arr[i]!=null){
                    curr.left = new TreeNode(arr[i]);
                    queue.add(curr.left);
                }
            }
            i++;
            if(i<arr.length){
                if(arr[i]!=null){
                    curr.right = new TreeNode(arr[i]);
                    queue.add(curr.right);
                }
            }
            i++;
        }
        return root;
    }
    public static void main(String[] args) {
        Integer[]arr={543,384,652,null,445,null,699};
        TreeNode root = buildTree(arr);
        System.out.println(iterative(root));
        System.out.println(maxLevelSum(root,2));
        System.out.println("min element: ");
        System.out.println(getMin(root));
    }
}
