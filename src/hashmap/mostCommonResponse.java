package hashmap;

import java.util.*;

public class mostCommonResponse {
    public static class Pair{
        String s;
        int val;
        Pair(String s,int val){
            this.s=s;
            this.val=val;
        }
    }
    public static String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer>map = new HashMap<>();
        for(List x:responses){
            HashSet<String>set = new HashSet<>();
            for(int i=0;i<x.size();i++){
                set.add(x.get(i).toString());
            }
            for(String z:set){
                map.put(z,map.getOrDefault(z,0)+1);
            }
        }
        PriorityQueue<Pair>heap = new PriorityQueue<>((a,b)->{
            if(a!=b){
                return Integer.compare(b.val,a.val);
            }
            else{
                return a.s.compareTo(b.s);
            }
        });
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            heap.add(new Pair(entry.getKey(),entry.getValue()));
        }

        System.out.println(map);
        return heap.poll().s;
    }
    public static void main(String[] args) {
        List<List<String>>responses=new ArrayList<>();
        responses.add(Arrays.asList("good", "ok", "good", "ok"));
        responses.add(Arrays.asList("ok", "bad", "good", "ok", "ok"));
        responses.add(Arrays.asList("good"));
        responses.add(Arrays.asList("bad"));
        System.out.println(findCommonResponse(responses));
    }
}
