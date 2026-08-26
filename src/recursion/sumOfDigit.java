package recursion;

public class sumOfDigit {
    public static int sum(int n){
        if(n==0)return 0;
        int x=n%10;
        return x+sum(n/10);
    }
    public static int count(int n){
        if(n==0)return 0;
        int x=n%10;
        return 1+count(n/10);
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(sum(n));
        System.out.println(count(n));
    }
}
