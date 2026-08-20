package TwoDArray;
import java.util.*;
public class differentTreaversal {
    public static void columnWise(int[][]nums){
        for(int j=0;j<nums.length;j++){
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void cornerTraversal(int[][]nums){
        int sum=0;
        int m=nums.length;
        int n=nums[0].length;
        for(int i=0;i<n;i++){
            sum+=nums[0][i];
        }

        System.out.println(sum);
    }
    public  static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int[][]nums=new int[n][n];
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums.length;j++){
//                nums[i][j]=sc.nextInt();
//            }
//        }
        int[][]nums={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        columnWise(nums);
        cornerTraversal(nums);
    }
}
