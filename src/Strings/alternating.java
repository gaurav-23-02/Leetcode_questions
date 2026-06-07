package Strings;

public class alternating {
    public static int minOperations(String s) {
        int count =0;
        int i=0;
        while(i<s.length()-1){
            int j=s.charAt(i)-'0';
            int jj=s.charAt(i+1)-'0';

            if((j^jj)==0){
                count++;
                i=i+2;
            }
            else{

                i=i+2;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String s ="1101";
        System.out.println(minOperations(s));
    }
}
