package array;

import java.util.HashMap;

public class spllitArray {
    public static boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int x:map.values()){
            if(x>2){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[]nums={1,1,2,2,3,4};
        System.out.println(isPossibleToSplit(nums));
    }
}
