package BitManipulation;

import java.util.HashMap;

public class taskSechdule {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(i%n==0){
                return false;
            }
        }
        return true;
    }
    public static int diagonalPrime(int[][] nums) {
        int max=Integer.MIN_VALUE;
        int x=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i][i])){
                if(nums[i][i]>max){
                    max=nums[i][i];
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i][n-i-1])){
                if(nums[i][n-i-1]>max){
                    max=nums[i][n-i-1];
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[][]nums={{1,2,3},{5,6,7},{11,10,9}};
        System.out.println(diagonalPrime(nums));
    }
}
