package recursion;

public class pow {
    public static double power(double x,int n){
        if(n==0)return 1;
        if(n<0){
            return (1/x)*power(1/x,-(n+1));
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        double x=2.1000;
        int n=3;
        System.out.println(power(x,n));
    }
}
