package TCSNQTPYQ;
import java.util.*;
public class stringStarHash {
    public static int count(String s){
        //###***
        //012345
        int starCount=0;
        int hashCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                starCount++;
            }
            else{
                hashCount++;
            }
        }
        if(hashCount>starCount){
            return starCount-hashCount;
        }
        else if(starCount>hashCount){
            return starCount-hashCount;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(count(s));
    }
}
