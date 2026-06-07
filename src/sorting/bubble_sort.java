package sorting;

import java.util.Arrays;

public class bubble_sort {
    static void sort(int []arr){
        for(int i=0;i<arr.length;i++){
            //run the steps n-1 times

            //for each step,max item will come at last respective index
            for (int j=1;j< arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
