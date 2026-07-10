package array;

import java.util.ArrayList;
import java.util.Arrays;

public class closestPrime {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int[] closestPrimes(int left, int right) {
        int[]ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        System.out.println(list);
        if(list.size()<2){
            return ans;
        }
        int n=list.size();
        if(list.get(n-1)-list.get(n-2)<list.get(1)-list.get(0)){
            ans[1]=list.get(list.size()-1);
            ans[0]=list.get(list.size()-2);
        }else if(list.get(n-1)-list.get(n-2)>=list.get(1)-list.get(0)){
            ans[0]=list.get(0);
            ans[1]=list.get(1);
        }
        System.out.println(Arrays.toString(ans));
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(closestPrimes(19,31));

    }

}
