package Binary_tree;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int val;
    Node right;
    Node left;
    Node2(int val){
        this.val=val;
    }
}
class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
        this.node=node;
        this.level=level;
    }
}

public class breath_first_search {
    public static void bfs(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);
        }

    }
    public static void levelwise(Node root){
        Queue<Pair> q = new LinkedList<>();
        int currLevel =0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            if(front.level!=currLevel){
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left!=null)q.add(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null)q.add(new Pair(front.node.right,front.level+1));
        }

    }
    public static void main(String[] args) {
        //        2
        //      /   \
        //     3     4
        //    / \   / \
        //   5   6 7   8
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);
        a.right=c;a.left=b;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        bfs(a);
        System.out.println(a);
        levelwise(a);
    }
}
