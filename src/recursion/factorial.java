package recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(facto(5));
    }
    public static int facto(int n){
        if(n==1||n==0) return 1;
        int ans= n*facto(n-1);
        return ans;
    }
}
