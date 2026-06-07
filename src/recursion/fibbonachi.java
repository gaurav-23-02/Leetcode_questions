package recursion;

public class fibbonachi {//givr the nth term and it will return the fibbonachi serires number at that place

    public static void main(String[] args) {
        System.out.println(fibo(2));
    }
    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}
