package array;

import java.util.HashMap;
import java.util.Map;

public class differnce {
    public static void main(String[] args) {
        String s="abbccd";
        String t="abbccde";
        HashMap<Character,Integer>map =new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),1);
        }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.remove(s.charAt(i));
            }
        }

        System.out.println(map.entrySet());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                char ans= entry.getKey();
                System.out.println(ans);
                break;
            }
        }

//        Character[]ans =new Character[1];
//        ans=map.keySet().toArray(new Character[0]);
//        System.out.println(ans[0]);
//        System.out.println();


    }
}
