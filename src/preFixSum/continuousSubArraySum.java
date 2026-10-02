package preFixSum;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class continuousSubArraySum {
    static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        map.put(0,1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(map.containsKey(rem)&&i!=0){
                return true;
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        System.out.println(map);

        return false;
    }
    public static void main(String[] args) {
        int[]nums={23,2,6,4,7};
        int k=13;
        System.out.println(checkSubarraySum(nums,k));
    }
}
