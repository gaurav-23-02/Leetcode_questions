package array;

import TCSNQTPYQ.Array;

import java.util.Arrays;

public class smallestIndex {
    static int smallestIndex1(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                int sum=0;
                while(nums[i]>0){
                    sum+=nums[i]%10;
                    nums[i]/=10;
                }
                nums[i]=sum;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==i){
                return nums[i];
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[]nums={1,10,11};
        System.out.println(smallestIndex1(nums));

    }
}
