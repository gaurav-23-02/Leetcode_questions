package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class intersectionPair {
    public static class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static int countIntersectingIntervals(int[][] intervals) {
        List<Pair> interval = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            interval.add(new Pair(intervals[i][0],intervals[i][1]));
        }
        interval.sort((a,b)->Integer.compare(a.first,b.first));
        int count=0;
        int check = interval.get(0).second;
        for(int i=1;i<interval.size();i++){
            if(interval.get(i).first<=check){
                count++;
            }
            check=interval.get(i).second;
        }
        for(Pair x:interval){
            System.out.println(x.first+" "+x.second);
        }
        return count;
    }
    public static void main(String[] args) {
        int[][]interval={{1,5},{2,4},{3,6}};
        System.out.println(countIntersectingIntervals(interval));
    }
}
