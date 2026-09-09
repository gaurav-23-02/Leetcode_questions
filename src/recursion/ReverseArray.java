package recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[]nums,int l,int r){
        if(l>=r)return;
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        reverse(nums,l+1,r-1);
    }
    public static boolean helper(String s,int l,int r){
        if(l>=r)return true;
        char left = s.charAt(l);
        char right = s.charAt(r);
        if(left==right){
            return helper(s,l+1,r-1);
        }
        else{
            return false;
        }
    }
    public static boolean helper1(String s, int i){
        if(i>=s.length()/2)return true;
        char left = s.charAt(i);
        char right = s.charAt(s.length()-i-1);
        if(left==right){
            return helper1(s,i+1);
        }
        else{
            return false;
        }
    }
    public static boolean palindrome(String s){
        int l=0;
        int r=s.length()-1;
        return helper1(s,0);

    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4,2};
        reverse(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
        System.out.println(palindrome("racecar"));
    }
}
