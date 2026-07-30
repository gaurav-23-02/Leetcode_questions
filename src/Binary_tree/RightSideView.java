package Binary_tree;

import java.util.*;

public class RightSideView {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            right=left=null;
        }
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer> retAns=new ArrayList<>();
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer>level = new ArrayList<>();
            int levelSize=q.size();
            for(int i=0;i<levelSize;i++){
                TreeNode curr = q.poll();
                if(curr.right!=null)q.add(curr.right);
                if(curr.left!=null)q.add(curr.left);
                level.add(curr.val);
            }
            ans.add(level);
        }
        System.out.println(ans);
        for(int i=0;i<ans.size();i++){
            retAns.add(ans.get(i).get(0));
        }
        return retAns;
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
    public static int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        Stack<TreeNode>st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            if(curr.left!=null){
                if(curr.left.left==null&&curr.left.right==null){
                    sum+=curr.left.val;
                }
                else{
                    st.push(curr.left);
                }
            }
            if(curr.right!=null)st.push(curr.right);
        }

        return sum;
    }

    public static void main(String[] args) {
        Integer[] root1 = {1,2,3,null,5,null,4};
        TreeNode root = buildTree(root1);

        Integer[] root2 = {1,2,3,4,5};
        TreeNode rootX = buildTree(root2);
        System.out.println(rightSideView(root));
        System.out.println(sumOfLeftLeaves(rootX));

    }
}
