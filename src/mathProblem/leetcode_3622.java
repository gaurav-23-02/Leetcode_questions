package mathProblem;

public class leetcode_3622 {
    public static int sum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public static int mul(int n){
        int m=1;
        while(n>0){
            m*=n%10;
            n/=10;
        }
        return m;
    }
    public static boolean checkDivisibility(int n) {
        System.out.println(sum(n));
        System.out.println(mul(n));
        if(n%(sum(n)+mul(n))==0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int n=99;
        System.out.println(checkDivisibility(n));
    }
}
