package hashmap;

import java.util.HashMap;
import java.util.Map;

public class SumOfElementsFrequencyDivByK {
    public static int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer>map =  new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()%k==0){
                sum+=entry.getValue()*entry.getKey();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]nums = {1,2,2,3,3,3,3,4};
        int k = 2;
        System.out.println(sumDivisibleByK(nums,k));
    }
}
