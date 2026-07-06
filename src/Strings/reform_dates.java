package Strings;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class reform_dates {
    public static String reformatDate(String num1, String num2) {
        BigInteger x = new BigInteger(num1);
        BigInteger y  = new BigInteger(num2);
        return x.multiply(y)+"";
    }

    public static void main(String[] args) {
        String num1="498828660196";
        String num2="840477629533";
        System.out.println(reformatDate(num1,num2));

    }
}
