package array;

import java.util.ArrayList;
import java.util.Arrays;

public class seperateDigits {
    public static int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                ans.append('1');
            }
            else{
                ans.append('0');
            }
        }
        String x = ans.toString();
        int a=Integer.parseInt(x,2);
        System.out.println(ans);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }
}