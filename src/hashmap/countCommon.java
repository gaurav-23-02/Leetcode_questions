package hashmap;

import java.util.HashMap;

public class countCommon {
    public static int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer>map1= new HashMap<>();
        HashMap<String,Integer>map2=new HashMap<>();
        for(int i=0;i<words1.length;i++){
            map1.put(words1[i], map1.getOrDefault(words1[i],0)+1);
        }
        for(int i=0;i<words2.length;i++){
            map2.put(words2[i], map2.getOrDefault(words2[i],0)+1);
        }
        System.out.println(map1);
        System.out.println(map2);
        int count=0;
        for(String x:map1.keySet()){
            if(map2.containsKey(x)&& map1.get(x)==1&&map2.get(x)==1){
                count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        String[] words1={"leetcode","is","amazing","as","is"};
        String[] words2={"amazing","leetcode","is"};
        System.out.println(countWords(words1,words2));
    }
}
