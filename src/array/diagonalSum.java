package array;

public class diagonalSum {
    public  static int diagona1lSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            if(mat.length%2==0){
                sum+=mat[i][i];
                sum+=mat[i][n-i-1];
            }
            else{
                sum+=mat[i][i];
                if(i!=n-i-1){
                    sum+=mat[i][n-i-1];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][]mat={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        System.out.println(diagona1lSum(mat));

    }
}
