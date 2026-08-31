package slidingWindow;

import java.util.HashMap;

public class longestSubStringWithKUnique {
    public static int longestKSubstr(String s, int k) {
        // code here
        int low=0;
        int res=0;
        HashMap<Character,Integer>map = new HashMap<>();
        for(int high=0;high<s.length();high++){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            while(map.size()>k){
                char leftChar =s.charAt(low);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                low++;
            }
            if(map.size()==k){
                res=Math.max(res,high-low+1);
            }
        }
        if(map.size()<k){
            return -1;
        }
        return res;

    }
    public static void main(String[] args) {
        String s="aaaa";
        int k=2;
        System.out.println(longestKSubstr(s,k));
    }
}
