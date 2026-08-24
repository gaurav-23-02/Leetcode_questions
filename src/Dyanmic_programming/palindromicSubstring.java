package Dyanmic_programming;
import com.sun.source.tree.Tree;
import java.util.Arrays;
public class palindromicSubstring {
    public static int countSubstring(String s){
        boolean[][]dp = new boolean[s.length()][s.length()];
        for(int i=0;i<dp.length;i++){
            dp[i][i]= true;
        }
        for(int i=0;i<dp.length-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
            }
            else{
                dp[i][i+1]=false;
            }
        }
        for(int len=3;len<=dp.length;len++){
            for(int i=0;i<=dp.length-len;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]){
                    dp[i][j]=true;
                }

            }
        }
        int count=0;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp.length;j++){
                if(dp[i][j]==true){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s ="aaa";
        System.out.println(countSubstring(s));
    }
}
