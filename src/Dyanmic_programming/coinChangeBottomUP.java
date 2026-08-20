package Dyanmic_programming;

import java.util.ArrayList;

public class coinChangeBottomUP {
    public static int tribonacci(int n) {
        ArrayList<Integer>dp = new ArrayList<>();
        dp.add(0);
        dp.add(1);
        dp.add(1);
        for(int i=3;i<=n;i++) {
            dp.add(dp.get(i - 1) + dp.get(i - 2) + dp.get(i-3));
        }
        System.out.println(dp);
        return dp.get(n);
    }

    public static void main(String[] args) {
        int n =4;
        System.out.println(tribonacci(n));
    }
}
