package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class smallestSubsequence {
    public static String smallestSubsequence1(String s) {
        HashSet<Character>set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        char[]ans=new char[set.size()];
        int idx=0;
        for(char x:set){
            ans[idx++]=x;
        }
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        StringBuilder ans1 = new StringBuilder();
        for(char x:ans){
            ans1.append(x);
        }
        return ans1.toString();
    }
    public static boolean areNumbersAscending(String s) {
        String[]words=s.split("\\s+");
        ArrayList<Integer>ans = new ArrayList<>();
        for (String x : words) {
            try {
                int num = Integer.parseInt(x);
                ans.add(num);
            } catch (NumberFormatException e) {

            }
        }
        for(int  i=0;i<ans.size()-1;i++){
            if(ans.get(i)>ans.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="1 box has 3 blue 4 red 6 green and 12 yellow marbles\"";
        System.out.println(areNumbersAscending(s));

    }

}
