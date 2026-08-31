package Binary_tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class binarySearchTree {
    public static TreeNode buildBST(int[]nums){
        TreeNode root = null;
        for(int num:nums){
            if(num!=-1){
                root =insertBST(root,num);
            }
        }
        return root;
    }
    public static List<Integer> inOrder(TreeNode root){
        List<Integer>ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr!=null||!stack.isEmpty()){
            while (curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        return ans;

    }
    public static boolean isValidBST(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr!=null||!stack.isEmpty()){
            while (curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        if(ans.size()<=1){
            return false;
        }
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)>ans.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static TreeNode insertBST(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left=insertBST(root.left,val);
        }
        else if(val>root.val){
            root.right=insertBST(root.right,val);
        }
        return root;
    }
    public static void main(String[] args) {
        int[] nums={2,2,2};
        TreeNode root = buildBST(nums);
        System.out.println(inOrder(root));
        System.out.println(isValidBST(root));

    }
}
