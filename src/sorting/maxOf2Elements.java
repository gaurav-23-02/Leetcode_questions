package sorting;

import java.util.Arrays;

public class maxOf2Elements {
    public static int maxProduct(int n) {
        String s=n+"";
        int[]ans=new int[s.length()];
        for(int i=0;i<s.length();i++) {
            ans[i] = s.charAt(i) - '0';
        }
        Arrays.sort(ans);
        return ans[ans.length-1]*ans[ans.length-2];
    }

    public static void main(String[] args) {
        int n=124;
        System.out.println(maxProduct(n));
    }
}
