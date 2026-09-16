package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reverseVowels {
    public static String  reverseVowels1(String s) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                list.add('0');
            }
            else{
                list.add(s.charAt(i));
            }
        }
        List<Character>vowel=new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                    ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel.add(ch);
            }
        }
        System.out.println(list);
        int idx=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)=='0'){
                list.set(i,vowel.get(idx++));
            }
        }
        System.out.println(vowel);
        System.out.println(list);
        StringBuilder ans =  new StringBuilder();
        for(char x:list){
            ans.append(x);
        }
        String realAns=ans.toString();
        return realAns;
    }

    public static void main(String[] args) {
       String s = "IceCreAm";
        System.out.println(reverseVowels1(s));
    }
}
