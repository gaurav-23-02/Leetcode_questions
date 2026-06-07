package search;

import java.util.Arrays;

public class binary2D {
    static void print(int[][]arr){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c< arr.length;c++){
                System.out.print(arr[r][c]+"\t");
                //"\n"is used for next line and \t is used for print element and tab
            }
            System.out.println();
        }
    }
    static int[]search(int[][]arr,int target){
        int r =0;
        int c =arr[0].length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }
        }return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [][]arr={{1,3}};
        print(arr);
        System.out.println(Arrays.toString(search(arr,3)));//Arrays.toString is used for returning the value in a strinf instead of an arrray
    }
}
