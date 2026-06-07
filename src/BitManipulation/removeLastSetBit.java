package BitManipulation;

public class removeLastSetBit {
    public static int removeSet(int n){
        n=(n&(n-1));
        return n;

    }

    public static void main(String[] args) {
        int n=12;
        System.out.println(removeSet(n));
    }
}
