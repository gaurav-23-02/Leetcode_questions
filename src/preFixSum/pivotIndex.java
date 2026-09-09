package preFixSum;

import java.util.Arrays;

public class pivotIndex {
    public static int pivotIDX(int[]nums){
         int[]prefix=new int[nums.length];
         int[]suffix=new int[nums.length];
         prefix[0]=0;
         suffix[nums.length-1]=0;
         for(int i=1;i<nums.length;i++){
             prefix[i]=prefix[i-1]+nums[i-1];
         }
         for(int i=nums.length-2;i>=0;i--){
             suffix[i]=suffix[i+1]+nums[i+1];
         }
         System.out.println(Arrays.toString(prefix));
         System.out.println(Arrays.toString(suffix));
         for(int i=0;i<nums.length;i++){
             if(prefix[i]==suffix[i]){
                 return i;
             }
         }
         return 1;

    }
    public static void main(String[] args) {
        int[]nums={1,7,3,6,5,6};
        System.out.println(pivotIDX(nums));
    }
}
