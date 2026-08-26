package recursion;

public class factorial {
    public static int facto(int n){
        if(n==1||n==0) return 1;
        int ans= n*facto(n-1);
        return ans;
    }
    public  static int  nsum(int n){
        if(n==1)return 1;
        return n+nsum(n-1);
    }
    public static void count(int n){
        if(n==0) {
            System.out.println("Blast Off");
            return;
        }
        count(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.println(facto(5));
        System.out.println(nsum(5));
        count(5);
    }
}
