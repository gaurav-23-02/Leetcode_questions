package hashmap;

import java.util.*;

public class wordPattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, HashSet<String>>map = new HashMap<>();
        String[]words=s.split(" ");
        HashSet<Character>chars = new LinkedHashSet<>();
        for(char x:pattern.toCharArray()){
            chars.add(x);
        }
        HashSet<String>set = new LinkedHashSet<>();
        for(String x:words){
            set.add(x);
        }

        for(int i=0;i<chars.size();i++){
            char ch =pattern.charAt(i);
            map.putIfAbsent(ch,new HashSet<>());
            map.get(ch).add(words[i]);
        }
        System.out.println(map);
        for(HashSet<String>x:map.values()){
            if(x.size()>1)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
}
