package Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class relativeRank {
    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer>heap= new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int x:score){
            heap.add(x);
        }
        HashMap<Integer,Integer>map = new HashMap<>();
        int k=1;
        while(!heap.isEmpty()){
            map.put(heap.poll(),k++);
        }
        System.out.println(map);
        String[] ans = new String[score.length];
        for(int i=0;i<score.length;i++){
            ans[i]=map.get(score[i])+"";
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i].equals("1")){
                ans[i]="Gold Medal";
            }
            if(ans[i].equals("2")){
                ans[i]="Silver Medal";
            }
            if(ans[i].equals("3")){
                ans[i]="Bronze Medal";
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]score={10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
