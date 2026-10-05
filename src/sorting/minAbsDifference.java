package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class minAbsDifference {
    public static class Tri{
        int first;
        int sec;
        int diff;
        Tri(int first,int sec,int diff){
            this.first=first;
            this.sec=sec;
            this.diff=diff;
        }
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        PriorityQueue<Tri>heap = new PriorityQueue<>((a,b)->Integer.compare(a.diff,b.diff));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                heap.add(new Tri(arr[i],arr[j],Math.abs(arr[j]-arr[i])));
            }
        }
        List<List<Integer>>list = new ArrayList<>();
        while(!heap.isEmpty()){
            Tri x=heap.poll();
            List<Integer>ans = new ArrayList<>();
            ans.add(x.first);
            ans.add(x.sec);
            list.add(ans);
            if(x.diff!=heap.peek().diff){
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[]arr={4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }
}
