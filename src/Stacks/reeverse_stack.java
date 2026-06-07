package Stacks;

import java.util.Stack;

public class reeverse_stack {
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top =st.pop();
        reverse(st);
        pushatbottom(st,top);
    }
    public static void pushatbottom(Stack<Integer> st,int val){
        if(st.size()==0){
            st.push(val);
            return;
        }
        int top =st.pop();
        pushatbottom(st,val);
        st.push(top);
    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack <>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
        reverse(st);
        Stack<Integer> rt=  new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        Stack<Integer> at=  new Stack<>();
        while(rt.size()>0){
            at.push(rt.pop());
        }
        while(at.size()>0){
            st.push(at.pop());
        }
        System.out.println(st);
    }
}
