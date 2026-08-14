package TCSNQTPYQ;
import java.util.*;
public class maxA {
    public static int countA(String s){
        int maxCount=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
                maxCount=Math.max(count,maxCount);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(countA(s));
    }
}
