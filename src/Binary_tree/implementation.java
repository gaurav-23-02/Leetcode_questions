package Binary_tree;

import java.sql.SQLOutput;
import java.util.*;

    public class implementation {
        static class Node{
            int data;
            Node right;
            Node left;
            Node(int data){
                this.data=data;
                left=right=null;
            }
        }
    public static void traversal(Node root){
        if(root==null)return;
        System.out.println(root.data+"  ");
        traversal(root.left);
        traversal(root.right);
    }
    public static int sum(Node root){
            if(root==null)return 0;
            return root.data+sum(root.left)+sum(root.right);
    }
    public static int mul(Node root){
            if(root==null)return 1;
            return root.data*mul(root.left)*mul(root.right);
    }
    public static int height(Node root){
            if(root==null)return 0;
            if(root.left==null&&root.right==null)return 0;
            return 1+Math.max(height(root.left),height(root.right));
    }
    public static int maxVal(Node root){
            if(root==null)return Integer.MIN_VALUE;
            return Math.max(root.data,Math.max(maxVal(root.left),maxVal(root.right)));
    }
    public  static int minVal(Node root){
            if(root==null)return Integer.MAX_VALUE;
            return Math.min(root.data,Math.min(minVal(root.left),minVal(root.right)));
    }
     public static Node buildTree(Scanner sc){
        System.out.println("Enter root value");
        int rootVal=sc.nextInt();
        Node root = new Node(rootVal);
        Queue<Node>queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.println("Enter left child of "+current.data +"(-1 if none):");
            int leftVal=sc.nextInt();
            if(leftVal!=-1){
                current.left = new Node(leftVal);
                queue.add(current.left);
            }
            System.out.println("Enter right child of"+current.data +"(-1 if none):");
            int rightVal=sc.nextInt();
            if(rightVal!=-1){
                current.right= new Node(rightVal);
                queue.add(current.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = buildTree(sc);
        traversal(root);
        System.out.println("Height of the tree is: "+height(root));
        System.out.println("Sum of the tree nodes are: "+sum(root));
        System.out.println("Maximum value in tree is: "+maxVal(root));
        System.out.println("Minimum value in the tree is: "+minVal(root));
        System.out.println("Multiplication of every Node result in: "+mul(root));
    }
}
