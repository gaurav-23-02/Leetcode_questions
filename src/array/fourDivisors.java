package array;

import java.util.ArrayList;
import java.util.Arrays;

public class fourDivisors {
    public static int sumFourDivisors(int[] nums) {
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x : nums) {
            int count = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count++;
                }
            }
            if (count == 4) {
                ans.add(x);
            }
        }
        System.out.println(ans);
        for(int x:ans){
            for(int i=1;i<=x;i++){
                if(x%i==0){
                    sum+=i;
                }
            }
        }
        return sum;
    }
    public static int  rearrange(int n,int s,int m){
        int[]ans = new int[n];
        ans[0]=s;
        for(int i=1;i<n;i++){
            if(i%2!=0){
                ans[i]=ans[i-1]+m;
            }
            else{
                ans[i]=ans[i-1]-1;
            }
        }
        System.out.println(Arrays.toString(ans));
        return 1;
    }
    public static String capatlize(String s){
        StringBuilder ans = new StringBuilder();
        String[]word=s.split(" ");
        for(int i=0;i<word.length;i++){
            StringBuilder x = new StringBuilder(word[i]);
            for(int j=0;j<x.length();j++){
                if(j!=0 && j!=x.length()-1){
                    ans.append(x.charAt(j));
                }
                else{
                    ans.append(Character.toUpperCase(x.charAt(j)));
                }
            }
            ans.append(" ");
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        int[]nums = {21,21};
        System.out.println(sumFourDivisors(nums));
        String s="dcab";
        System.out.println(rearrange(3,7,7));
        System.out.println(capatlize("take you forward"));

    }
}
