package slidingWindow;

import java.util.HashMap;

public class leetcode_3 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int low=0;
        int res=0;
        for(int high=0;high<s.length();high++){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            int k=high-low+1;
            while(map.size()<k){
                 char leftChar = s.charAt(low);
                 map.put(leftChar,map.get(leftChar)-1);
                 if(map.get(leftChar)==0){
                     map.remove(leftChar);
                 }
                 low++;
                 k=high-low+1;
            }
            if(map.size()==k){
                res=Math.max(res,k);
            }

        }
        return res;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
