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
        traversal(root.left);
        traversal(root.right);
        System.out.println(root.data+"  ");
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
    }
}
