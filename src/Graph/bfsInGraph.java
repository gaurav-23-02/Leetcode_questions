package Graph;
import java.util.*;
public class bfsInGraph {
    public static class Node{
        int val;
        List<Node>neighbours;
        public Node(){
            val=0;
            neighbours=new ArrayList<>();
        }
        public Node(int _val){
            val=_val;
            neighbours=new ArrayList<>();
        }
        public Node(int _val, ArrayList<Node> _neighbours) {
            val = _val;
            neighbours = _neighbours;
        }
    }
    public static List<Integer> bfsGraph(Node node){
        Queue<Node>q = new LinkedList<>();
        Set<Node>st=new HashSet<>();
        List<Integer>ans = new ArrayList<>();
        q.add(node);
        st.add(node);
        while(!q.isEmpty()){
            Node curr = q.poll();
            ans.add(curr.val);
            for(Node adj:curr.neighbours){
                if(!st.contains(adj)){
                    st.add(adj);
                    q.add(adj);
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
        node1.neighbours.add(node2);
        node2.neighbours.add(node3);

        node2.neighbours.add(node1);
        node2.neighbours.add(node4);

        node3.neighbours.add(node1);
        node3.neighbours.add(node5);

        node4.neighbours.add(node2);
        node4.neighbours.add(node5);

        node5.neighbours.add(node3);
        node5.neighbours.add(node4);
        System.out.println(bfsGraph(node1));
    }
}
