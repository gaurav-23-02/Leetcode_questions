package BitManipulation;

public class clearithBit {
    public static int clearbit(int n,int i){
        n=n&(~(1<<i));
        return n;
    }

    public static void main(String[] args) {
        int n =13;
        System.out.println(clearbit(n,2));
    }
}
