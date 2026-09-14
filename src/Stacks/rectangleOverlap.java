package Stacks;

import java.util.Stack;

public class rectangleOverlap {
    static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        for(int i=rec1[0];i<=rec1[2];i++){
            if(i==rec2[0]||i==rec2[2])return true;
        }
        for(int i=rec1[1];i<=rec1[3];i++){
            if(i==rec2[1]||i==rec2[3])return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int[] rec1={0,0,2,2};
        int[] rec2={1,1,3,3};
        System.out.println(isRectangleOverlap(rec1,rec2));

    }
}
