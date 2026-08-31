package mathProblem;

public class addnumber {
    public static int add(int n){
        int sum=0;
        if(n<10)return n;
        while(n>0){
            int x=n%10;
            sum+=x;
            n/=10;
        }
        return add(sum);
    }
    public static void main(String[] args) {
        int x=38;
        System.out.println(add(x));

    }
}

