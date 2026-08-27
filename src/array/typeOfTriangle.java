package array;

import java.util.HashMap;

public class typeOfTriangle {
    public static String triangleType(int[] nums) {
        HashMap<Integer,Integer>map= new HashMap<>();
        if(nums[0]>=nums[1]+nums[2] || nums[1]>=nums[0]+nums[2] || nums[2]>=nums[0]+nums[1]){
            return "none";
        }
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.containsValue(3)){
            return "equilateral";
        }
        if(map.containsValue(2)){
            return "isosceles";
        }
        if(!map.containsValue(3)&&!map.containsValue(2)){
            return "scalene";
        }

        return "";
    }

    public static void main(String[] args) {
        int[]nums={5,3,8};
        System.out.println(triangleType(nums));
    }
}
