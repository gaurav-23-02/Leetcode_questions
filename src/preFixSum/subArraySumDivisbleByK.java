package preFixSum;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class subArraySumDivisbleByK {
    int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[]nums={4,5,0,-2,-3,1};
        int k=5;
        subArraySumDivisbleByK sc = new subArraySumDivisbleByK();
        System.out.println(sc.subarraysDivByK(nums,k));
    }
}
