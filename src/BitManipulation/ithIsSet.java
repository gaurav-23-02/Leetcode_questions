package BitManipulation;

public class ithIsSet {
    public static boolean checkIthBit(int n, int i) {
        if (
                ((n >> i) & 1) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int n=13;
        System.out.println(checkIthBit(n,2));
    }
}
