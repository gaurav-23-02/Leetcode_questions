package recursion;

public class fibbonachi {//givr the nth term and it will return the fibbonachi serires number at that place
    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }
    //iterative approach
    public static int iterativefibo(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        int x=0;
        int y=1;
        int fibo=1;
        for(int i=2;i<=n;i++){
            int z =x+y;
            x=y;
            y=z;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(fibo(9));
        System.out.println(iterativefibo(9));
    }
}