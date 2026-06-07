package Strings;

public class consecutive_char {
    public static int maxPower(String s) {
        int max=1;
        for(int i=0;i<s.length()-1;i++) {
            int count = 1;
            char c = s.charAt(i);
            if (s.charAt(i + 1) == s.charAt(i)) {
                count++;
            } else {
                count = 1;
                c = s.charAt(i + 1);
            }

            if (count > max) {
                max = count;
            }


        }
        return max;

    }

    public static void main(String[] args) {
        String s ="abbcccddddeeeeedcba";
        System.out.println(maxPower(s));

    }
}
