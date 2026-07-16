package Binary_tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class minAbsoluteDiff {
    static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    static TreeNode buildTree(Integer[]arr){
        if(arr.length==0||arr[0]==null){
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode>queue=new LinkedList<>();
        int i=1;
        queue.add(root);
        while(!queue.isEmpty()&&i<arr.length){
            TreeNode curr = queue.poll();
            if(i<arr.length){
                if(arr[i]!=null){
                    curr.left = new TreeNode(arr[i]);
                    queue.add(curr.left);
                }
                i++;
            }
            if(i<arr.length){
                if(arr[i]!=null){
                    curr.right = new TreeNode(arr[i]);
                    queue.add(curr.right);
                }
                i++;
            }
        }
        return root;
    }
    public static int iterate(TreeNode root){
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        List<Integer>list=new ArrayList<>();
        while(!st.isEmpty()){
            TreeNode curr= st.pop();
            list.add(curr.val);
            if(curr.right!=null)st.add(curr.right);
            if(curr.left!=null)st.add(curr.left);
        }
        System.out.println(list);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            int x = Math.abs(list.get(i+1)-list.get(i));
            if(x<min){
                min=x;
            }
        }
        return min;
    }
    public static void  flatten(TreeNode root){
        List<Integer>list=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            TreeNode curr = st.pop();
            list.add(curr.val);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        System.out.println(list);
        createLL(list);
    }
    public static void createLL(List<Integer>list){
        if(list.size()==0){
            return;
        }
        Node head = new Node(list.get(0));
        Node curr = head;
        for(int i=1;i<list.size();i++){
            curr.next= new Node(list.get(i));
            curr=curr.next;

        }
    }
    public static void main(String[] args) {
        Integer[]arr={1,2,5,3,4,null,6};
        TreeNode root = buildTree(arr);
        System.out.println(iterate(root));
        flatten(root);

    }
}
