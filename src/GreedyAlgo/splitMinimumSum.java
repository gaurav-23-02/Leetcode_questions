package GreedyAlgo;

import java.util.Arrays;

public class splitMinimumSum {
    public static int splitNum(int num){
        String s =num+"";
        int[]nums=new int[s.length()];
        for(int i=0;i<s.length();i++){
            nums[i]=s.charAt(i)-'0';
        }
        Arrays.sort(nums);
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                s1.append(nums[i]);
            }
            else{
                s2.append(nums[i]);
            }
        }
        int num1 = Integer.parseInt(s1.toString());
        int num2 = Integer.parseInt(s2.toString());
        return num1+num2;

    }
    public static void main(String[] args) {
        int num =4325;
        System.out.println(splitNum(num));
    }
}
