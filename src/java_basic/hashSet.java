package java_basic;

import java.util.HashSet;
public class hashSet {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("ram");
        st.add("shyam");
        st.add("ram");
        System.out.println(st);
        System.out.println(st.contains("ram"));

    }
}
