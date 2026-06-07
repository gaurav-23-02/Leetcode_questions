package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class string {

    public static void main(String[] args) {
        int[] nums={175868717,841457609,-948571070,-747264172};
        int sum1=0;
        int sum2=0;
        ArrayList<Integer> sumA = new ArrayList<>();
        ArrayList<Integer> sumB = new ArrayList<>();
        if(nums.length>0)sumB.add(nums[0]);
        if(nums.length>1)sumB.add(nums[1]);
        if(nums.length>2)sumA.add(nums[2]);
        if(nums.length>3)sumA.add(nums[3]);
        for(int i=4;i<nums.length;i++){
            if(i%2!=0&&i%3!=0){
                sumA.add(nums[i]);
                nums[i]=0;
            }
            if(nums[i]!=0){
                sumB.add(nums[i]);
            }
        }
        System.out.println(sumA);
        System.out.println(sumB);
        for(int i=0;i<sumA.size();i++){
            sum1=sum1+sumA.get(i);

        }
        for(int i=0;i<sumB.size();i++){
            sum2=sum2+sumB.get(i);

        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println((sum1-sum2));


    }

}
