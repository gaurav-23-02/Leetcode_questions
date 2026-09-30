package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class longestPalindrome {
    public static int longestPalindrome(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int count=0;
        for(int x:map.values()){
            if(x%2!=0){
                count=count+x-1;
            }
        }
        for(int x:map.values()){
            if(x%2!=0){
                count+=1;
                break;
            }
        }
        for(int x:map.values()){
            if(x%2==0){
                count+=x;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
