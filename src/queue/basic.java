package queue;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println("top most element is "+q.peek());
        System.out.println("top most element is "+q.element());
        System.out.println("size of queue "+q.size());
    }
}
