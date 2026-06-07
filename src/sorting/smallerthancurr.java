package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class smallerthancurr {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[]sortNums=new int[nums.length];
        int[]ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sortNums[i]=nums[i];
        }
        Arrays.sort(sortNums);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==sortNums[j]){
                    ans[i]=j;
                }
            }
        }
        return ans;



    }

    public static void main(String[] args) {
        int[] nums = {9,7,7,};
        String s=Arrays.toString(smallerNumbersThanCurrent(nums));
        System.out.println(s);
    }
}
