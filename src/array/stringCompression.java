package array;
import java.util.*;
public class stringCompression {
    public static int reverseAlternate(char[] chars){
        HashMap<Character,Integer>map = new HashMap<>();
        if(chars.length==1){
            return 1;
        }
        for (int i=0;i<chars.length;i++){
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
        return map.values().size()+map.keySet().size();
    }

    public static void main(String[] args) {
        char[]chars = {'a','b','b','c','c','c','c'};
        System.out.println(reverseAlternate(chars));
    }
}
