package Dyanmic_programming;
public class tabulation_houserobber {
    public static int robber(int[]loot){
        int[]dp=new int[loot.length];
        dp[0]=loot[0];
        dp[1]=Math.max(loot[1],loot[0]);
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(loot[i]+dp[i-2],dp[i-1]);
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        int[]loot={6,2,4,8,3,1};
        System.out.println(robber(loot));
    }
}
