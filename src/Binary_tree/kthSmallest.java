package Binary_tree;

import com.sun.source.tree.Tree;

import java.util.*;

public class kthSmallest {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static int kthSmallest1(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode>st = new Stack<>();
        st.push(root);
        while(!st.empty()){
            TreeNode curr = st.pop();
            list.add(curr.val);
            if(curr.left!=null)st.push(curr.left);
            if(curr.right!=null)st.push(curr.right);
        }
        System.out.println(list);
        Collections.sort(list);
        return list.get(k-1);
    }
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int occurence=map.get(s.charAt(0));
        for(int x:map.values()){
            if(x!=occurence){
                return false;
            }
        }
        System.out.println(map);
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(2);
        root.left=a;
        root.right=b;
        a.right=c;
        System.out.println(kthSmallest1(root,1));
        System.out.println(areOccurrencesEqual("abcdd"));
    }
}

