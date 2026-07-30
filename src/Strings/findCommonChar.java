package Strings;

import java.util.*;

public class findCommonChar {
//    public static List<String> commonChars(String[] words) {
//
//
//
//
//    }
    public static boolean divideArray(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(int x:map.values()){
            sum+=1;
        }
        System.out.println(map);
        System.out.println(sum);
        if(sum==nums.length/2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[]words = {"bella","label","roller"};
        int[]nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
//        System.out.println(commonChars(words));

    }
}
