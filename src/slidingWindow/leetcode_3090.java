package slidingWindow;

import java.util.HashMap;

public class leetcode_3090 {
    public static int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int i=0;
        int length=0;
        int maxLength=0;
        for(int j=0;j<s.length();j++){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while (map.get(s.charAt(j))>2){
                int value = map.get(s.charAt(i))-1;
                map.put(s.charAt(i),value);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            maxLength=Math.max(maxLength,j-i+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s ="bcbbbcba";
        System.out.println(maximumLengthSubstring(s));
    }
}
