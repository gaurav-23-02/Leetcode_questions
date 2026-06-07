package BitManipulation;

import java.sql.SQLOutput;
import java.util.Arrays;

public class singleNumber2 {
    public static int singleNumber(int[] nums) {
        int value=0;
        for(int i=0;i<nums.length;i++){
            value=value^nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return value;
    }
    public int singleNumber2(int[] nums) {
        return 1;
    }

    public static void main(String[] args) {
        int[]nums={2,2,3 };
        int[]num={2,2,3,2};
        System.out.println(singleNumber(nums));
    }
}
