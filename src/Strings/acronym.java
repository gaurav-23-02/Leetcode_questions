package Strings;

import java.util.Arrays;
import java.util.List;

public class acronym {
    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.size();i++){
            String a = words.get(i);
            ans.append(a.charAt(0));

        }
        String ans1=ans.toString();
        if(ans1.equals(s)){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("never","gonna","give","up","on","you");
        String s =s = "ngguoy";
        System.out.println(isAcronym(words,s));

    }
}
