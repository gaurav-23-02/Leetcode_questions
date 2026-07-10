package Strings;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class reform_dates {
    public static String reformatDate(String s) {
        String[]words=s.split(" ");
        System.out.println(Arrays.toString(words));
        StringBuilder ans = new StringBuilder();
        System.out.println(words[1]);
        for(int i=0;i<words.length;i++){
            if(i%2!=0){
                ans.append(words[i]);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s="Ram aam khata hai";
        //Ram maa khata iah
        System.out.println(reformatDate(s));
    }
}
