package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class maxFreq {
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int x:map.values()){
            max=Math.max(x,max);
        }
        int count=0;
        for(int x:map.values()){
            if(x==max){
                count+=max;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]nums={1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
}
