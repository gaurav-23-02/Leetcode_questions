package array;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class nge {
    public static boolean isArraySpecial(int[] nums) {
        if(nums.length==1)return true;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]%2;
        }
        System.out.println(Arrays.toString(nums));
        return false;

    }

    public static void main(String[] args) {
        int[]nums={4,3,1,6};
        System.out.println(isArraySpecial(nums));
    }
}
