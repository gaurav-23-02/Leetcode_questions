package array;

import java.util.Stack;

public class smallestMissingK {
    public static int missingMultiple(int[]nums,int k){
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<nums.length;i++){
            st.push(nums[i]);
        }
        for(int i=1;i<100;i++){
            if(!st.contains(k*i)){
                return k*i;
            }
        }
        return 88;
    }
    public static int loop(int n){
        if(n==1)return 1;
        return loop(n-1);
    }
    public static void main(String[] args) {
        int[]nums={8,2,3,4,6};
        int k=2;
        System.out.println(missingMultiple(nums,k));
        System.out.println(loop(10));
    }
}
