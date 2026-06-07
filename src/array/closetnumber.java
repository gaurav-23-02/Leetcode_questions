package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class closetnumber {
    public static int largestDivisibleSubset(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        int max=0;
        int i=0;
        while(i<3){
            for(int j=0;j<nums.length;j++){
                if(nums[j]>max){
                    max=nums[j];
                    System.out.println(max);
                    i++;

                }
                max=0;

            }

        }
        for(int j=0;j<nums.length;j++){
            ans.add(nums[j]);
        }
        System.out.println(ans);
        return max;


    }

    public static void main(String[] args) {
        int[]nums={2,2,3,1};
        System.out.println(largestDivisibleSubset(nums));




    }
}
