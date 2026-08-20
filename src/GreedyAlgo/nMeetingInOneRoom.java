package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class nMeetingInOneRoom {
    public static class Pair{
        int a;
        int b;
        Pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    public static List<Integer> nMeeting(int[]start,int[]end){
        ArrayList<Pair>list = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            list.add(new Pair(start[i],end[i]));
        }
        list.sort((a,b)->Integer.compare(a.b,b.b));

        for(Pair p:list){
            System.out.println(p.a+" "+p.b);
        }
        ArrayList<Integer>ans = new ArrayList<>();
        int count=1;
        int n =list.get(0).b;
        ans.add(n);
        for(int i=1;i<start.length;i++){
            if(list.get(i).a>n){
                count++;
                n=list.get(i).b;
                ans.add(n);
            }
        }
        System.out.println(count);
        return ans;

    }
    public static void main(String[] args) {
        int[]start= {1,3,0,5,8,5};
        int[]end=   {2,4,6,7,9,9};
        System.out.println(nMeeting(start,end));
    }
}
