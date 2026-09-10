package backTracking;

import java.util.*;

public class allSubSequenceOfString {
    public static void helper(String s,List<String>ans, int i,String curr){
        if(i==s.length()){
            ans.add(curr);
            return;
        }
        helper(s,ans,i+1,curr+s.charAt(i));
        helper(s,ans,i+1,curr);
    }
    public static List<String> sub(String s){
        List<String> ans = new ArrayList<>();
        helper(s,ans,0,"");
        return ans;
    }
    public static void main(String[] args) {
        String s="Raj";
        System.out.println(sub(s));

    }
}
