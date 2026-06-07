package array;

import java.util.ArrayList;
import java.util.Arrays;

public class spam_message {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            w1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            w2.append(word2[i]);
        }
        String s=w1.toString();
        String s1=w2.toString();
        if(s1.equals(s)){
            return true;
        }
        else{
            return false;
        }


    }


    public static void main(String[] args) {
        String[]word1 = {"ab", "c"};
        String[]word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));



    }
}
