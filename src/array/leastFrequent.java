package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class leastFrequent {
    public static int getLeastFrequentDigit(int n) {
        String s=n+"";
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int min = Integer.MAX_VALUE;
        int ans=-1;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()<min){
                min=entry.getValue();
                ans=entry.getKey();
            }
        }
        return ans-'0';
    }

    public static void main(String[] args) {
        int n=723344511;
        System.out.println(getLeastFrequentDigit(n));
    }
}
