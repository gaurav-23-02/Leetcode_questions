package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_438 {
    public static boolean validAnagram(String s,String p){
        for(int i=0;i<s.length();i++){
            if(!s.contains(p.charAt(i)+"")){
                return false;
            }
        }
        return true;
    }
    public static List<Integer> findAnagrams(String s, String p) {
        StringBuilder window = new StringBuilder();
        for(int i=0;i<p.length();i++){
            window.append(s.charAt(i));
        }
        ArrayList<Integer>ans = new ArrayList<>();
        if(validAnagram(window.toString(),p)){
            ans.add(0);
        }
        int k=p.length();
        for(int i=k;i<s.length();i++){
            window.deleteCharAt(0);
            window.append(s.charAt(i));
            if(validAnagram(window.toString(),p)){
                ans.add(i-k+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd","abc"));
    }
}
