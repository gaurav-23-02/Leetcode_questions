package Strings;

import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class reform_dates {
    public static boolean reformatDate(String sentence) {
        HashMap<Character,Integer>map = new HashMap<>();
        String alpha="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<alpha.length();i++){
            map.put(alpha.charAt(i), map.getOrDefault(alpha.charAt(i),0)+1);
        }
        for(int i=0;i<sentence.length();i++){
            map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
        }
        for(int x:map.values()){
            if(x==1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelzydog";

        System.out.println(reformatDate(sentence));
    }
}
