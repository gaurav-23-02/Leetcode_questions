package array;

import java.util.ArrayList;

public class uglyNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isUgly(int n) {
        ArrayList<Integer>ans= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans.add(i);
            }
        }
        if(ans.contains(2)){
            ans.remove(2);
        }
        if(ans.contains(5)){
            ans.remove(5);
        }if(ans.contains(3)){
            ans.remove(5);
        }
        for(int i=0;i<ans.size();i++){
            if(isPrime(ans.get(i))==true){
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        int n=14;
        System.out.println(isUgly(n));

    }
}
