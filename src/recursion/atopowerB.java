package recursion;

public class atopowerB {
    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(pow2(2,4));
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        return a*pow(a,b-1);
    }
    public static int pow2(int a, int b){
        if(b==0) return 1;
        int call = pow2(a,b/2);
        if(b%2==0){
            return call*call;
        }
        else return a*call*call;
    }
}
