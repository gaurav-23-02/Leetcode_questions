package Strings;
import java.util.*;
public class substring {
    public static void main(String[] args) {
//        String str ="abcde";
//        System.out.println(str.substring(0));
        //printing all the substrings of an string
//    Scanner sc = new Scanner(System.in);
//    String str = sc.next();
       // String str = "abcd";
//        for(int i=0;i<=3;i++){
//            for(int j=i+1;j<=4;j++)
//                System.out.println (str.substring(i,j));
//      }
        String s="hello";
        s=s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);

    }
}
