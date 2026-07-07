import java.util.*;
public class Main {
    public static long sumAndMultiply(int n) {
        String s=n+"";
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) != '0') {
                ans.append(s.charAt(i));
            }
        }
        int ans1=Integer.parseInt(ans.toString());
        int number=ans1;
        int sum=0;
        while(ans1>0){
            sum+=ans1%10;
            ans1/=10;
        }
        long realAns =(long)number*(long)sum;
        return realAns;
    }

    public static void main(String[] args) {
        System.out.println(sumAndMultiply(65463628));
    }

}
