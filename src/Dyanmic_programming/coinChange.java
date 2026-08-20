package Dyanmic_programming;

import java.util.HashMap;

public class coinChange {
    public static int changeCoin(int[]coins,int amount){
        if(amount==0)return 0;
        if(amount<0)return -1;
        int minCoins =Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int result=changeCoin(coins,amount-coins[i]);
            if(result!=-1){
                minCoins=Math.min(minCoins,1+result);
            }
        }
        return minCoins;
    }
    public static int helper(int[]coins,int amount,HashMap<Integer,Integer>map){
        if(amount==0)return 0;
        if(amount==-1)return -1;
        if(map.containsKey(amount)){
            return map.get(amount);
        }
        int minCoins=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int result=changeCoin(coins,amount-coins[i]);
            if(result!=-1){
                minCoins=Math.min(minCoins,1+result);
            }
        }
        int resultfinal=minCoins;
        map.put(amount,resultfinal);
        return resultfinal;
    }
    public static int coinChange(int[]coins,int amount){
        HashMap<Integer,Integer>map = new HashMap<>();
        return helper(coins,amount,map);
    }

    public static void main(String[] args) {
        int[]coins={1,2,5};
        int amount =10;
        System.out.println(changeCoin(coins,amount));
        System.out.println(coinChange(coins,amount));
    }
}
