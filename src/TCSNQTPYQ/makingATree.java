package TCSNQTPYQ;
import java.util.*;
public class makingATree {
    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static void recursiveTraversal(TreeNode root,List<Integer>ans){
        List<Integer>list = new ArrayList<>();
        if(root==null)return;
        recursiveTraversal(root.left,list);
        list.add(root.val);
        recursiveTraversal(root.right,list);
    }
    public static List<Integer> traversal(TreeNode root){
        List<Integer>list =  new ArrayList<>();
        Stack<TreeNode>st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr =st.pop();
            list.add(curr.val);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        return list;
    }
    public static List<List<Integer>> bfs(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> ans = new ArrayList<>();
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
    public static TreeNode build(int[]nums){
        if(nums.length==0||nums[0]==-1)return null;
        TreeNode root =new TreeNode(nums[0]);
        Queue<TreeNode> q = new LinkedList<>();
        int i=1;
        q.add(root);
        while(i<nums.length){
            TreeNode curr = q.poll();
            if(i<nums.length){
                if(nums[i]!=-1){
                    curr.left=new TreeNode(nums[i]);
                    q.add(curr.left);
                }i++;
            }
            if(i<nums.length){
                if(nums[i]!=-1){
                    curr.right = new TreeNode(nums[i]);
                    q.add(curr.right);
                }
                i++;
            }
        }
        return root;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        TreeNode root = build(nums);
        System.out.println(traversal(root));
        System.out.println(bfs(root));
        List<Integer>ans=new ArrayList<>();
        recursiveTraversal(root,ans);
    }

}
