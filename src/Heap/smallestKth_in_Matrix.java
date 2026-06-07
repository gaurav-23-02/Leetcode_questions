package Heap;

import javax.crypto.KEM;
import java.sql.SQLOutput;
import java.util.Arrays;

public class smallestKth_in_Matrix {
    public static int kthSmallest(int[][] matrix, int k) {
        int[]ans= new int[matrix.length*matrix[0].length];
        int idx=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[idx++]=matrix[i][j];
            }
        }
        Arrays.sort(ans);
        return ans[k-1];
    }

    public static void main(String[] args) {
       int[][] matrix = {{1,2},{1,3}};
        System.out.println(kthSmallest(matrix,2));
    }
}
