package Strings;

public class matchingEnds {
    public static int firstMatchingIndex(String s) {
        int i=0;
        int end=s.length()-1;
        while(i<=end){
            if(s.charAt(i)==s.charAt(end)){
                return i;
            }
            i++;
            end--;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s="abc";
        System.out.println(firstMatchingIndex(s));

    }
}
