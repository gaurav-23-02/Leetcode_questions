package BitManipulation;

public class bitFlip {
    public static int minBitFlips(int start, int goal) {
        int count=0;
        int x = start^goal;
        String s = Integer.toBinaryString(x);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int start=10;
        int goal=7;
        System.out.println(minBitFlips(10,7));


    }
}
