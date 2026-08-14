package Strings;

import java.math.BigInteger;
import java.util.ArrayList;

public class trailingZeros {
    public static int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n/=5;
            count+=n;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(trailingZeroes(30));
    }
}
