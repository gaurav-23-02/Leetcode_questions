package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_queue {
    public static void main(String[] args) {
        int k =3;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Stack<Integer>st = new Stack<>();
        while(q.size()>0){
            st.push(q.remove());
        }
        int n = st.size();
        while(st.size()>k){
            st.pop();
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
