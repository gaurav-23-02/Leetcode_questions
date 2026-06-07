package BitManipulation;

public class toggleithBit {
    public static int toggle(int n,int i){
        n=n^(1<<i);
        return n;
    }

    public static void main(String[] args) {
        int n=13;
        System.out.println(toggle(n,2));
    }
}
