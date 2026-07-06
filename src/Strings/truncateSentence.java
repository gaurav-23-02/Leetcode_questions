package Strings;

public class truncateSentence {
    public static String truncateSentences(String s, int k) {
        String[]words=s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<k;i++){
            ans.append(words[i]);
            ans.append(" ");
        }
        ans.delete(ans.length()-1,ans.length());
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentences(s,4));
    }
}
