package Strings;
import java.util.*;
public class stringwithotherdatatype {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = "abc";
        str = str +"xyz";
        str +='r';
        str +=10;
        System.out.println(str);
        System.out.println("abc"+(10+20));

    }
}
