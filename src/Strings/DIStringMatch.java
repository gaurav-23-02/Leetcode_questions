package Strings;

import TCSNQTPYQ.Array;

import java.util.Arrays;

public class DIStringMatch {
    static int[] diStringMatch(String s) {
        int start=0;
        int end=s.length();
        int[]ans = new int[s.length()+1];
        int n =ans.length-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                ans[i]=start++;
            }
            else{
                ans[i]=end--;
            }
        }int sum=0;
        for(int x:ans){
            sum+=x;
        }
        int realSum=n*(n+1)/2;
        ans[ans.length-1]=realSum-sum;

        return ans;
    }
    public static void main(String[] args) {
        String s="IDID";
        String s1="DDI";
        System.out.println(Arrays.toString(diStringMatch(s1)));
    }
}
