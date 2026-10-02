package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class originalTyped {
    static int possibleStringCount(String word) {
        HashMap<Character,Integer>map = new LinkedHashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        int count=0;
        for(int x:map.values()){
            if(x==1){
                count++;
            }
            else{
                count=count+(x-1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String word="abbcccc";
        System.out.println(possibleStringCount(word));
    }
}
