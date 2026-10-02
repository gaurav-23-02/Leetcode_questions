package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ransomNote {
    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map =  new LinkedHashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            map.put(ransomNote.charAt(i),map.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        System.out.println(map);
        for(int i=0;i<magazine.length();i++){
            char s=magazine.charAt(i);
            if(map.containsKey(s)){
                map.put(s,map.get(s)-1);
            }
            if(map.getOrDefault(s,0)==0)map.remove(s);

        }
        System.out.println(map);
        if(map.size()==0)return true;
        return false;

    }
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
