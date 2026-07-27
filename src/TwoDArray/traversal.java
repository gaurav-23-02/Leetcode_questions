package TwoDArray;

import java.util.Scanner;

public class traversal {
    public static int maxSum(int[][]nums){
        int rowSum=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums.length;j++){
                sum+=nums[i][j];
            }
            rowSum=Math.max(rowSum,sum);
        }
        int colSum=0;
        for(int j=0;j<nums.length;j++) {
            int Sum = 0;
            for (int i = 0; i < nums.length; i++) {
                Sum += nums[i][j];
            }
            colSum = Math.max(colSum, Sum);
        }
        return rowSum+colSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]nums = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        System.out.println(maxSum(nums));
    }
}

