package BitManipulation;

public class SetithBit {
    public static int setbit(int n,int i){
        n=(n|(1<<i));
        return n;
    }

    public static void main(String[] args) {
        int n =8;
        System.out.println(setbit(n,2));
    }
}
