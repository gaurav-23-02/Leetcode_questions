package Strings;

import TCSNQTPYQ.Array;

import java.util.*;

public class brackerPair {
    public static String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String>map = new LinkedHashMap<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                ans.append(s.charAt(i));
            }
            else if(s.charAt(i)=='('){
                StringBuilder check = new StringBuilder();
                i++;
                while (s.charAt(i)!=')'){
                    check.append(s.charAt(i));
                    i++;

                }
                if(map.containsKey(check.toString())){
                    ans.append(map.get(check.toString()));
                }
                else{
                    ans.append('?');
                }
                System.out.println(check);

            }
        }
        System.out.println(map);
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="hi(name)";
        List<List<String>>knowledge=new ArrayList<>();
        List<String>ans = new ArrayList<>();
        ans.add("a");
        ans.add("b");
        knowledge.add(ans);
        System.out.println(evaluate(s,knowledge));

    }
}
