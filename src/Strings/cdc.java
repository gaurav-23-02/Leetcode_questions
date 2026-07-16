package Strings;
import java.util.*;
public class cdc {
    public static  String remove(String s,String t){
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!t.contains(s.charAt(i)+"")){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(remove(s,t));
    }
}
