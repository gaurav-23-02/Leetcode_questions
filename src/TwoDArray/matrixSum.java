package TwoDArray;

import java.util.Arrays;

public class matrixSum {
    public static int matrixSum1(int[][] nums) {
        int sum=0;
        for(int[]x:nums){
            Arrays.sort(x);
        }
        for(int i=0;i<nums[0].length;i++){
            System.out.println(Arrays.deepToString(nums));
            int currMax=0;
            for(int j=0;j<nums.length;j++){
                currMax=Math.max(currMax,nums[j][i]);
            }
            sum+=currMax;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][]nums={{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
        System.out.println(matrixSum1(nums));


    }
}
