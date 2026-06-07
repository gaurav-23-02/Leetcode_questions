package array;

import java.util.Arrays;
import java.util.HashMap;

public class QUES_80 {
    public static int removeDuplicates(int[] nums) {
        int product=1;
        Arrays.sort(nums);
        int i=nums.length-1;
        while(i>nums.length-4){
            product*=nums[i];
            i--;
        }
        return product;


    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        System.out.println(removeDuplicates(nums));


    }

}
