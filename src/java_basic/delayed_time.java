package java_basic;

import static java.lang.Integer.parseInt;

public class delayed_time {
    public static String removeTrailingZeros(String num) {
        StringBuilder ans = new StringBuilder(num);
        for(int i=num.length()-1;i>0;i--){
            if(num.charAt(i)=='0'){
                ans.deleteCharAt(i);
            }
            else{
                return ans.toString();
            }
        }
        return ans.toString();
    }


    public static void main(String[] args) {
       String num = "51230100";
        System.out.println(removeTrailingZeros(num));
    }
}
