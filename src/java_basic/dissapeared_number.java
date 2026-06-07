package java_basic;

import java.util.ArrayList;

public class dissapeared_number {
    static <list> ArrayList<Object> miss(int[]nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]<=nums.length && nums[i]!=nums[correct]){//swap when the nums[i] is less than N if N ignore
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;

            }else {
                i++;
            }
        }
        ArrayList<Object> ans=new ArrayList<>();
        for (int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }return ans;
    }
    public static void main(String[] args) {
        int[]arr={1,1};
        System.out.println(miss(arr));

    }
}
