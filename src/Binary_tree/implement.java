package Binary_tree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class implement {


    private static class Node{
        private int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }
    private Node root;

    public void initialize(Scanner scanner){
        System.out.println("Enter the root node value");
        int value=scanner.nextInt();
        root = new Node(value);
        populates(scanner,root);
    }
    private void populates(Scanner scanner,Node Node){
        System.out.println("Do you want to enter left vale of"+Node.val);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left Node "+Node.val);
            int val=scanner.nextInt();
            Node.left=new Node(val);
            populates(scanner,Node.left);
        }
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the Right Node "+Node.val);
            int val=scanner.nextInt();
            Node.right=new Node(val);
            populates(scanner,Node.right);
        }

    }
    public static void display(Binary_tree.Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.right);
        display(root.left);

    }

}
