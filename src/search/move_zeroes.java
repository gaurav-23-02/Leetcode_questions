package search;

import java.util.Arrays;

public class move_zeroes {
    static void zero(int[]nums){
        for(int i =0;i<nums.length-1;i++){
            for(int j=1;j<nums.length-i-1;j++){
                if (nums[j]==0 &&nums[j+1]!=0){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;

                }
            }
        }
        for(int val:nums){
            System.out.println(val+"");
        }
    }
    public static void main(String[] args) {
        int[]arr={0,1,0,3,12};
        zero(arr);
        System.out.println(Arrays.toString(arr));

    }
}
