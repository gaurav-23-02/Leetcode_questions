package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class median_of_2Arrays {
    static int xor;
    public static int array(int n,int start) {
        int[] ans = new int[n];
        for (int i = 1; i < n; i++) {
            ans[0] = start;
            ans[i] = start + (2 * i);
        }
        System.out.println(Arrays.toString(ans));
        int xor = 0;
        xor=ans[0]^ans[1];
        for(int i=2;i<n;i++){
            xor=xor^ans[i];
        }
        return xor;
    }


    public static void main(String[] args) {
        System.out.println(array(4,3));


    }


}
