package Heap;

import java.util.*;

public class topKFrequentWords {
    public static class Pair{
        String s;
        int val;
        Pair(String s,int val){
            this.s=s;
            this.val=val;
        }
    }
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String ,Integer>map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Pair>heap = new PriorityQueue<>((a,b)->{
            if(a.val!=b.val){
                return Integer.compare(b.val,a.val);
            }
            return a.s.compareTo(b.s);
        });
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            heap.add(new Pair(entry.getKey(),entry.getValue()));
        }
        List<String>ans =  new ArrayList<>();
        while(k!=0){
            Pair x=heap.poll();
            ans.add(x.s);
            k--;
        }
        Collections.sort(ans);
        return ans;

    }
    public static void main(String[] args) {
        String[]words = {"i","love","leetcode","i","love","coding"};
        int k=2;
        System.out.println(topKFrequent(words,k));
    }
}
