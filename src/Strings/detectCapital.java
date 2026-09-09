package Strings;

import java.util.Arrays;

public class detectCapital {
    static boolean detectCapitalUse(String word) {
        int capital =0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                capital++;
            }
        }
        if(capital==word.length())return true;
        else if(capital==0)return true;
        else if(capital==1&&Character.isUpperCase(word.charAt(0)))return true;
        return false;

    }

    public static void main(String[] args) {
        String s =  "JaiShreeRam";
        System.out.println(detectCapitalUse(s));
        int[]arr= {1,2,3,4,5};
        int sum=0;
        int[]prefix=new int[arr.length];
        prefix[0]=0;
        prefix[1]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }
        System.out.println(Arrays.toString(prefix));
    }
}
