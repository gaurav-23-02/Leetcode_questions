package Binary_tree;

import java.rmi.dgc.Lease;
import java.util.*;

public class leaf_SimilarrTree {
    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>Leaf1=new ArrayList<>();
        List<Integer>Leaf2 = new ArrayList<>();
        Stack<TreeNode>st = new Stack<>();
        st.add(root1);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            if(curr.left==null&&curr.right==null) Leaf1.add(curr.val);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        System.out.println(Leaf1);
        Stack<TreeNode>st1=new Stack<>();
        st1.add(root2);
        while (!st1.isEmpty()){
            TreeNode curr1 = st1.pop();
            if(curr1.left==null&&curr1.right==null) Leaf2.add(curr1.val);
            if(curr1.right!=null)st1.push(curr1.right);
            if(curr1.left!=null)st1.push(curr1.left);
        }
        if(Leaf1.size()!=Leaf2.size())return false;

        for(int i=0;i<Leaf1.size();i++){
            if(Leaf1.get(i)!=Leaf2.get(i)){
                return false;
            }
        }
        System.out.println(Leaf2);
        return true;
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
            }i++;
            if(i<arr.length){
                if(arr[i]!=null){
                    curr.right=new TreeNode(arr[i]);
                    queue.add(curr.right);
                }
            }i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[]root1={3,5,1,6,2,9,8,null,null,7,4};
        Integer[]root2={3,5,1,6,7,4,2,null,null,null,null,null,null,9,8};
        TreeNode head1=buildTree(root1);
        TreeNode head2=buildTree(root2);
        System.out.println(leafSimilar(head1,head2));
    }
}
