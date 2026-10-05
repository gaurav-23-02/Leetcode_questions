package TwoDArray;

import java.util.Arrays;

public class maxFromEachRow {
    public static int deleteGreatestValue(int[][] grid) {
        for(int[]x:grid){
            Arrays.sort(x);
        }
        int maxSum=0;
        for(int i=0;i<grid[0].length;i++){
            int maxRow=0;
            for(int j=0;j<grid.length;j++){
                maxRow=Math.max(maxRow,grid[j][i]);
            }
            maxSum+=maxRow;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[][]grid={{1,2,4},{3,3,1}};
        System.out.println(deleteGreatestValue(grid));
    }
}
