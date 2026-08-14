package Strings;
import java.util.*;
public class topKFrequentWord {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String ,Integer>map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        System.out.println(map);
        ArrayList<String>ans = new ArrayList<>();
        ArrayList<Integer>maxElements = new ArrayList<>();
        for(int x:map.values()){
            maxElements.add(x);
        }
        Collections.sort(maxElements);
        for(int i=maxElements.size()-1;i<maxElements.size()-k;i--){
            for(Map.Entry<String,Integer>entry:map.entrySet()){
                ans.add(entry.getKey());
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        String[]words={"i","love","leetcode","i","love","coding"};
        int k=2;
        System.out.println(topKFrequent(words,k));
    }
}
