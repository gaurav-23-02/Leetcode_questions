package Strings;

public class reverse_words_151 {
    public static String reverse(String s){
        StringBuilder ans = new StringBuilder();
        int startIdx = s.length()-1;
        while(startIdx>=0){
            while(startIdx>=0&&s.charAt(startIdx)==' '){
                startIdx--;
            }
            int endIdx=startIdx;
            while(startIdx>=0&&s.charAt(startIdx)!=' '){
                if(ans.length()==0){
                    ans.append(s.substring(startIdx,endIdx));
                }
                if(ans.length()!=0){
                    ans.append(' ');
                    ans.append(s.substring(startIdx,endIdx));
                }
            }
        }return ans.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.print(reverse(s));

    }
}
