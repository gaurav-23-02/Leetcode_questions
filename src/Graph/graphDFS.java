package Graph;
import java.util.*;
public class graphDFS {
    public static class Node{
        int val;
        List<Node>Neighbors;
        Node(int val) {
            this.val = val;
            Neighbors = new ArrayList<>();
        }
    }
    public static List<Integer> DFS(Node node){
        Stack<Node>st = new Stack<>();
        List<Integer>ans = new ArrayList<>();
        Set<Node>visited=new HashSet<>();
        st.add(node);
        visited.add(node);
        while(!st.isEmpty()){
            Node curr = st.pop();
            ans.add(curr.val);
            for(Node neighbour:curr.Neighbors){
                if(!visited.contains(neighbour)){
                    visited.add(neighbour);
                    st.push(neighbour);
                }
            }
        }
        return ans;

    }
    public static void main(String[]args){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.Neighbors.add(node2);
        node1.Neighbors.add(node3);

        node2.Neighbors.add(node4);
        node2.Neighbors.add(node1);

        node3.Neighbors.add(node5);
        node3.Neighbors.add(node1);

        node4.Neighbors.add(node2);
        node5.Neighbors.add(node3);
        System.out.println(DFS(node1));
    }
}
