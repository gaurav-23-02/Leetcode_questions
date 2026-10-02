package Strings;

import java.util.Arrays;

public class formedByCharacters {
    static int reverseParentheses(String s) {
        int maxCount=0;
        int count=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='('){
                count++;
                maxCount=Math.max(count,maxCount);
            }
            if(s.charAt(i)==')'){
                count=0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String s="(1)+((2))+(((3)))";
        System.out.println(reverseParentheses(s));

    }
}