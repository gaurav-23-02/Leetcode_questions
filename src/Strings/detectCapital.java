package Strings;

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
    }
}
