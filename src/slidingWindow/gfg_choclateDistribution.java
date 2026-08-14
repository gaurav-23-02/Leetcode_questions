package slidingWindow;

import java.util.Arrays;

public class gfg_choclateDistribution {
    public static int findMinDiff(int arr[], int m) {
        // code here
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-m+1;i++){
            int x=arr[i+m-1]-arr[i];
            min=Math.min(x,min);
        }
        return min;

    }
    public static void main(String[] args) {
        int[]arr={3,4,1,9,56,7,9,12};
        System.out.println(findMinDiff(arr,5));
    }
}
