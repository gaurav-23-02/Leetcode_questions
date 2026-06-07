package Dyanmic_programming;
//
public class number_of_paths {
    static int[][]dp;

//    public static int path(int m,int n){
//        if(m==1||n==1) return 1;
//        return path(m,n-1)+path(m-1,n);
//    }
    public static int paths(int m,int n){
        dp = new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }return dp[m-1][n-1];

    }


    public static void main(String[] args) {
        System.out.println(paths(4,7));

    }
}
