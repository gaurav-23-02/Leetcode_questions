package Strings;

import java.util.Arrays;

public class largestSubStringBetweenEqual {
    static int maxLengthBetweenEqualCharacters(String s) {
        int[]alpha = new int[26];
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            alpha[idx]=i;
//
        }
        for(int i=0;i<s.length();i++){
            if(alpha[i]>0){
               alpha[i]=Math.abs(alpha[i]-i)-1;
            }

        }
        System.out.println(Arrays.toString(alpha));
        int max=-1;
        for(int x:alpha){
            max=Math.max(max,x);
        }
        return max;
    }
    public static void main(String[] args) {
        //String s="mgntdygtxrvxjnwksqhxuxtrv";
        String s ="cbzxy";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
