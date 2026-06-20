package array;

public class primeRange {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrimesInRange(int n) {
        StringBuilder ans= new StringBuilder(n+"");
        int m=Integer.parseInt(ans.reverse().toString());
        int count=0;
        int y=Math.min(m,n);
        int x=Math.max(m,n);
        for(int i=y;i<=x;i++){
            if(isPrime(i)==true){
                count+=i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(sumOfPrimesInRange(n));
    }


}
