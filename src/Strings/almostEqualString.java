package Strings;

import java.util.HashMap;

public class almostEqualString {
    public static boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(char x:word1.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
        for(char x:word2.toCharArray()){
                map.put(x,map.getOrDefault(x,0)-1);
        }
        System.out.println(map);
        for(int x:map.values()){
            int y=Math.abs(x);
            if(y>3){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(checkAlmostEquivalent("bccb","zzzz"));
    }

}
