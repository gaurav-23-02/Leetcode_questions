package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class leetcode_452 {
    public static class Pair{
        int start;
        int end;
        Pair(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public static int findMinArrowShots(int[][] points) {
        ArrayList<Pair>ans = new ArrayList<>();
        for(int i=0;i<points.length;i++){
            ans.add(new Pair(points[i][0],points[i][1]));
        }
        ans.sort((a,b)->Integer.compare(a.end,b.end));
        for(Pair pairs:ans){
            System.out.println(pairs.start+" "+ pairs.end);
        }
        int count=1;
        int n=ans.get(0).end;
        for(int i=1;i<ans.size();i++){
            if(n<ans.get(i).start){
                count++;
                n=ans.get(i).end;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[][]points={{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
}
