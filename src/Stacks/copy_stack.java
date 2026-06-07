package Stacks;
import java.util.*;
public class copy_stack {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> st = new Stack<>();
//        int n;
//        System.out.println("enter the number of elements you want to insert");
//        n = sc.nextInt();
//        System.out.println("enter the elements :");
//        for(int i=0;i<n;i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
        Stack<Integer> st1 = new Stack <>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        st1.push(6);
        System.out.println(st1);
        Stack<Integer> st2 = new Stack<>();
        while(st1.size()>0){
            int x = st1.peek();
            st2.push(x);
            st1.pop();
        }
        System.out.println(st2);
        //System.out.println(st1);
        Stack<Integer> st3 = new Stack<>();
        while(st2.size()>0){
            int x = st2.peek();
            st3.push(x);
            st2.pop();
        }
        System.out.println(st3);



    }
}
