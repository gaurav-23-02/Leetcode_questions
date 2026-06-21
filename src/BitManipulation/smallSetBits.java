package BitManipulation;

import java.util.Arrays;

public class smallSetBits {
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        double avg=Integer.MAX_VALUE;
        while(start<end){
            double calAvg=((double) nums[start]+(double) nums[end])/2;
            if(calAvg<avg){
                avg=calAvg;
            }
            start++;
            end--;
        }
        return avg;
    }

    public static void main(String[] args) {
        int[] nums={7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }


}
