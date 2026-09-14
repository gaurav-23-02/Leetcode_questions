package GreedyAlgo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LemonadeChange {
    static boolean lemonadeChange1(int[] bills) {
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                map.put(5,map.getOrDefault(5,0)+1);
            }
            else if(bills[i]==10){
                if(map.getOrDefault(5,0)<1)return false;
                map.put(5,map.get(5)-1);
                map.put(10,map.getOrDefault(10,0)+1);
            }
            else if(bills[i]==20){
                if(map.getOrDefault(10,0)>=1&&map.getOrDefault(5,0)>=1){
                    map.put(10,map.get(10)-1);
                    map.put(5,map.get(5)-1);
                }
                else if(map.getOrDefault(5,0)>=3){
                    map.put(5,map.get(5)-3);
                }
            }else{
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[]bills={5,5,10,10,20};
        System.out.println(lemonadeChange1(bills));
    }
}
