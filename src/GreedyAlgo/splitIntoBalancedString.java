package GreedyAlgo;

import java.util.HashMap;

public class splitIntoBalancedString {
    public static int balancedStringSplit(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.getOrDefault('R',0)==map.getOrDefault('L',0)){
                map.remove('R');
                map.remove('L');
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        String s="LLLLRLLRRLLRLRLRLRLRRLLRRLLRLRRRRLLRRLLLRLRRRLRRLLRLRRRRLLRLRLRLRRLRLRLLLRLLRRLRLRRRRRLLRRRLRRLLRLLRLLLRLRLLLLLRLLLLLLRRLLLRRRRRRLRRLRLRRLLRLRRRRRRLRRRRRLLRRLLRRLRLLRRRRLRRRRLRLRLLRRRLLLLRRLLLLRRLRRRLLRRRRRRLRLLLRLRRLRLLLRRRLRLLRRLRLRLLLRRLLLLRRLRLRRLRLRRRRLRLRLRLRRLLRRLRLRLLLRLRRRLRRRLRRLRLLLRLLRRRRRLRLLLLRRLLRLLLRRLLRRLLLLLLRLLRRRRRRLRRLLLRRLLLLRRLRRLLLLLRRRRLRLRRLRLLRLLLRLLRLLLRLLRLRLRLLLRLLLLL";
        System.out.println(balancedStringSplit(s));
    }
}
