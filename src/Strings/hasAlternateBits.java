package Strings;

import java.util.HashMap;

public class hasAlternateBits {
    public static boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
    }
}
