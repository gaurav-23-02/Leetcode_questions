package TCSNQTPYQ;

import java.util.Arrays;
import java.math.BigInteger;

public class StringFrequArray {
    public static void main(String[] args) {
        String s="Aaaurav";
        int[]arr = new int[26];
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                int idx = s.charAt(i)-'A';
                arr[idx]+=1;
            }
            else{
                int idx = s.charAt(i)-'a';
                arr[idx]+=1;
            }
        }
        BigInteger a = new BigInteger("12345678901234567890");
        long x = a.longValue();
        System.out.println(x);
        String s1 = a+"";
        System.out.println(s1);
        long MOD=10000000007L;
        System.out.println(a.mod(BigInteger.valueOf(1000000007)));
        System.out.println(Arrays.toString(arr));
    }
}
