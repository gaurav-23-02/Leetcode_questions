package TCSNQTPYQ;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class oddIndexSumZero {
    public static int oddIndexSum(int[]nums){
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            System.out.println(map);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(-nums[i])){
                int x=map.getOrDefault(-nums[i],0);
                if(x+i%2!=0)count++;
            }
        }
        System.out.println(map);

        return count/2;
    }
    public static void main(String[] args) {
        int[]nums={1,-1,-1,1};
        System.out.println(oddIndexSum(nums));
    }
}
