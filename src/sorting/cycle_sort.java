package sorting;

import java.util.Arrays;

public class cycle_sort {
    static void cycle(int[]arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp =arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int[]arr={6,5,4,3,2,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));

    }
}
