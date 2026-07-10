package Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static String removeDuplicateLetters(String s) {
        Set<Character> set= new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        Character[]ans= new Character[set.size()];
        int idx=0;
        for(Character x:set){
            ans[idx++]=x;
        }
        Arrays.sort(ans);
        StringBuilder ans1= new StringBuilder();
        for(int i=0;i<ans.length;i++){
            ans1.append(ans[i]);
        }
        return ans1.toString();
    }

    public static void main(String[] args) {
        String s= "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }
}
