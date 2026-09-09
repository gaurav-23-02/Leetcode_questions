package recursion;

public class printName {
    public static void helperName(String s,int n){
        if(n==0)return;
        System.out.println(s);
        helperName(s,n-1);

    }
    public static void print(int n){
        helperName("Gaurav",5);
    }
    public static void printLinear(int i,int n){
        if(i>n)return;
        System.out.print(i+" ");
        printLinear(i+1,n);
    }
    public static void printOpp(int i,int n){
        if(i<1)return;
        System.out.print(i+" ");
        printOpp(i-1,n);

    }
    public static int sum1(int n){
        if(n==0)return 0;
        return n+sum1(n-1);
    }
    public static int sum(int i,int sum){
        if(i<1)return sum;
        return sum(i-1,sum+i);
    }

    public static void main(String[] args) {
        print(5);
        printLinear(1,5);
        System.out.println();
        printOpp(5,5);
        System.out.println();
        System.out.println("Sum of first N natural numbers");
        System.out.println(sum(5,0));
        System.out.println(sum1(5));

    }
}
