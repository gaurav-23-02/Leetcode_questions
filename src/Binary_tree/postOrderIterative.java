package Binary_tree;

import java.util.*;

public class postOrderIterative {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
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
    public static void postOrder(TreeNode root){
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode curr = st1.pop();
            st2.push(curr);
            if(curr.left!=null)st1.push(curr.left);
            if(curr.right!=null)st1.push(curr.right);
            System.out.print(curr.val+" ");
        }
        System.out.println();
        int n = st2.size();
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(st2.pop().val);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Integer[]arr={1,2,3,4,5,null,8,null,null,6,7,9,null};
        postOrder(buildTree(arr));
    }
}
