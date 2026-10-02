package GreedyAlgo;

import java.util.Arrays;

public class kitemsWithMAXSum {
    public static String removeDigit(String number, char digit) {
        char[]numbers=number.toCharArray();
        int[]ans =new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            ans[i]=numbers[i]-'0';
        }
        int k=digit-'0';
        for(int i=0;i<ans.length-1;i++){
            if(ans[i]==k&&ans[i+1]>=ans[i]){
                ans[i]=0;
            }
            else if(ans[i]==k){
                ans[i]=0;
            }
        }
        StringBuilder ans1 = new StringBuilder();
        for(int x:ans){
            if(x!=0){
                ans1.append(x);
            }
        }

        System.out.println(Arrays.toString(ans));
        return ans1.toString();
    }
    public static void main(String[] args) {
       String number = "1231";char digit = '1';
        System.out.println(removeDigit(number,digit));
    }
}
