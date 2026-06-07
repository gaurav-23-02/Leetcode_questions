package hashmap;

import java.util.*;

public class intersection2Array {
    public static int repeatedSubstringPattern(String []words,String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            StringBuilder ans =  new StringBuilder(words[i]);
            String ansnew=ans.toString();
            if(ansnew.startsWith(pref)){
                count++;
            }

        }
        return count;

    }


    public static void main(String[]args){
        String[]words ={"pay","attention","practice","attend"};
        String pref="at";
        System.out.println(repeatedSubstringPattern(words,pref));
    }
}
