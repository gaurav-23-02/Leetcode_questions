package Stacks;
import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        System.out.println(st.isEmpty() );
        st.push(1);//1
        st.push(2);//1 2
        st.push(3);//1 2 3
        st.push(4);//1 2 3 4
        //peek
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println("size of stack= "+st.size());
        System.out.println(st.isEmpty());//check if the stack is empty or not bbooleean function


    }
}
