package BitManipulation;

public class NumberOfBitChange {
    public static int minChanges(int n, int k) {
        String s =Integer.toBinaryString(n);
        String t = Integer.toBinaryString(k);
        int i=0;
        int j=0;
        int count=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)!=t.charAt(j)){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minChanges(13,4));
    }
}
