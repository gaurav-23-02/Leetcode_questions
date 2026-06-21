package Strings;

import java.util.HashMap;

public class leetcode3 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                break;
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(map);
        int count=0;
        for(int x:map.values()){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
