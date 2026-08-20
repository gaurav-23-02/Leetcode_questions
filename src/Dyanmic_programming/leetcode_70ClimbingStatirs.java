package Dyanmic_programming;

import java.util.ArrayList;
import java.util.HashMap;

public class leetcode_70ClimbingStatirs {
    //Top-Down Approach
    public static int distinctWays(int n, HashMap<Integer,Integer>map){
        if(n==1||n==2)return n;
        if(!map.containsKey(n)){
            map.put(n,distinctWays(n-1,map)+distinctWays(n-2,map));
        }
        return map.get(n);
    }

    //Bottoms-Up Approach
    public static int distinctWays1(int n){
        ArrayList<Integer>dp = new ArrayList<>();
        dp.add(1);
        dp.add(2);
        for(int i=2;i<n;i++){
            dp.add(dp.get(i-1)+dp.get(i-2));
        }
        System.out.println(dp);
        return dp.get(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        HashMap<Integer,Integer>map = new HashMap<>();
        System.out.println(distinctWays(n,map));
        System.out.println(distinctWays1(n));
    }

}
