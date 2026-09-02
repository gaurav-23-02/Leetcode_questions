package array;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode_4038 {
    static int countSpecialIntegers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]nums={3,3,1,2,2,1};
        System.out.println(countSpecialIntegers(nums));
    }
}
