package Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.PriorityQueue;

public class sort_array {
    public static int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        int count=0;
        for(int x:map.values()){
            if(x%2==0){
                count+=x;
            }
        }
        if(map.containsValue(1)){
            count+=1;
        }
        return count;

    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(longestPalindrome(s));
    }
}
