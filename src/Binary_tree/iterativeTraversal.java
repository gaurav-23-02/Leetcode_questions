package Binary_tree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativeTraversal {
    static class  Node{
        int val;
        Node right;
        Node  left;
        Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static  boolean hasPathSum(Node root,int targetSum){
        if(root==null)return false;
        if(root.left==null&&root.right==null){
            return targetSum==root.val;
        }
        int remain=targetSum-root.val;
        return hasPathSum(root.left,remain)||hasPathSum(root.right,remain);
    }
    //Iterative preOrder Traversal
    public static List<Integer> traverseIterative(Node root){
        List<Integer>ans=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        st.push(root);
        while(!st.empty()){
            Node curr = st.pop();
            ans.add(curr.val);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        return ans;
    }
    //Iterative postOrder Traversal
    public static List<Integer> postOrderIterative(Node root){
        List<Integer>ans = new ArrayList<>();
        Stack<Node>st=new Stack<>();
        st.push(root);
        while (!st.empty()){
            Node curr =  st.pop();
            ans.add(curr.val);
            if(curr.left!=null)st.push(curr.left);
            if(curr.right!=null)st.push(curr.right);
        }
        return ans;
    }
    public static List<Integer> inOrderIterative(Node root){
        List<Integer>list=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        Node curr = root;
        while(curr!=null||!st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr =st.pop();
            list.add(curr.val);
            curr=curr.right;
        }return list;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        Node a = new Node(4);
        Node b = new Node(8);
        Node c = new Node(11);
        Node d = new Node(13);
        Node e = new Node(4);
        Node f = new Node(7);
        Node g =  new Node(2);
        Node h = new Node(1);
        root.left=a;
        root.right=b;
        a.left=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        e.right=h;
        System.out.println(hasPathSum(root,22));
        System.out.println("Iterative preOrder traversal");
        System.out.println(traverseIterative(root));
        System.out.println("Iterative postOrder traversal");
        System.out.println(postOrderIterative(root));
        System.out.println("Iterative inOrder traversal");
        System.out.println(inOrderIterative(root));

    }
}
