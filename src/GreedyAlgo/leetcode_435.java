package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.list;

public class leetcode_435 {
    public static class Pair{
        int start;
        int end;
        Pair(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        ArrayList<Pair>list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            list.add(new Pair(intervals[i][0],intervals[i][1]));
        }
        list.sort((a,b)->Integer.compare(a.end,b.end));
        int count=0;
        int res=list.get(0).end;
        for(int i=1;i<list.size();i++){
            if(res>list.get(i).start){
                count++;
            }
            else{
                res=list.get(i).end;
            }
        }
        for(Pair pair:list){
            System.out.println(pair.start+" "+pair.end);
        }
        return count;
    }

    public static void main(String[] args) {
        int[][]intervals={{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }

}
