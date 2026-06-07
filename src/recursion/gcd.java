package recursion;

public class gcd {
    public static void main(String[] args) {
        System.out.println(hcf(24,60));
    }
    public static int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }

}
