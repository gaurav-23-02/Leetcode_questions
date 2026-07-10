package Strings;
import java.util.*;
public class topKFrequentWord {
    public static long countVowels(String word) {
        long count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||
                    word.charAt(i)=='o'||word.charAt(i)=='u'){
                count++;
            }
        }
        long ans = (count*(count+1));
        return ans;

    }


    public static void main(String[] args) {
        String[]words={"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k=4;
        System.out.println(countVowels("aba"));

    }
}
