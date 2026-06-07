package Strings;
import java.util.*;
public class string_builder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        str.append("  world");
        str.setCharAt(0,'m');
        str.insert(0,'m');
        str.deleteCharAt(1);
        StringBuilder sb= new StringBuilder("gaurav");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        System.out.println(str);
        String s ="gaurav";
        s.toLowerCase();


    }
}
