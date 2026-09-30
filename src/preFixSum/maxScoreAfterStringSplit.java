package preFixSum;

public class maxScoreAfterStringSplit {
    static int maxScore(String s) {
        int zeroScore=0;
        if(s.charAt(0)=='0')zeroScore+=1;
        int oneScore=0;
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i)=='1'){
                oneScore++;
            }
        }
        int max=0;
        max=Math.max(max,zeroScore+oneScore);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='1'){
                oneScore--;
                max=Math.max(max,oneScore+zeroScore);
            }
            else{
                zeroScore++;
                max=Math.max(max,oneScore+zeroScore);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s="1111";
        System.out.println(maxScore(s));
    }
}
