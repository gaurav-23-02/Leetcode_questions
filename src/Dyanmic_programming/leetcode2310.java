package Dyanmic_programming;

import java.util.ArrayList;
import java.util.HashMap;

public class leetcode2310 {
    public static int minimumNumbers(int num, int k) {
        ArrayList<Integer>dp= new ArrayList<>();
        dp.add(k);
        for(int i=1;i<=num;i++){
            int x=10*i+k;
            dp.add(x);
            if(x>num)break;
        }
        System.out.println(dp);
        int count=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<dp.size();i++){
            map.put(dp.get(i),i);
        }
        for(int i=0;i<dp.size();i++){
            for(int j=i+1;j<dp.size();j++){
                if(dp.get(i)+dp.get(j)==num){
                    count++;
                }
            }
        }
        if(count==0)return -1;
        return count;
    }
    public static void main(String[] args) {
        int num=1;
        int k=1;
        System.out.println(minimumNumbers(num,k));
    }
}
