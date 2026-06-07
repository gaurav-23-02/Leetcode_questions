package java_basic;

import java.util.Arrays;

public class set_mismatch {
    static int[] mismatch(int[]arr){
        int i=0;
        while(i<arr.length);
        int correct=arr[i]-1;
        if(arr[i]!=arr[correct]){
            int temp=arr[i];
            arr[i]=arr[correct];
            arr[correct]=temp;
        }else{
            i++;
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return new int[] {arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[]arr={1,2,2,4};
        mismatch(arr);
        System.out.println(Arrays.toString(arr));


    }
}
