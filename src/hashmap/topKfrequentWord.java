package hashmap;

import java.util.*;

public class topKfrequentWord {
    public static int[] topKFrequent(int[] arr) {
        int max=-1;
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>0;i--){
            if(arr[i]>max) {
                max= Math.max(arr[i], max);
                arr[i]=max;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[]arr={17,18,5,4,6,1};
        System.out.println(topKFrequent(arr));
    }
}
