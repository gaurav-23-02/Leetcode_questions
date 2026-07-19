package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class reportSpam {
    public static boolean reportSpam1(String[] message, String[] bannedWords) {
        HashMap<String,Integer>map=new HashMap<>();
        Set<String> set1= new HashSet<>();
        for(String x:message){
            set1.add(x);
        }
        ArrayList<String>list1=new ArrayList<>();
        for(String x:set1){
            list1.add(x);
        }
        for(int i=0;i<list1.size();i++){
            map.put(list1.get(i),map.getOrDefault(list1.get(i),0)+1);
        }
        System.out.println(list1);
        Set<String> set2= new HashSet<>();
        for(String x:bannedWords){
            set2.add(x);
        }
        ArrayList<String>list2=new ArrayList<>();
        for(String x:set2){
            list2.add(x);
        }
        for(int i=0;i<list2.size();i++){
            map.put(list2.get(i),map.getOrDefault(list2.get(i),0)+1);
        }
        System.out.println(list2);
        System.out.println(map);
        int count=0;
        for(int x:map.values()){
            if(x>=2){
                count++;
            }
        }
        if(count>=2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[]message = {"hello","programming","fun"};
        String[]bannedWords = {"world","programming","leetcode"};
        System.out.println(reportSpam1(message,bannedWords));
    }
}
