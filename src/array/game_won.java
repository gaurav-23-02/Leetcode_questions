package array;
import java.util.*;

public class game_won {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder  ans = new StringBuilder();

        for(int i=0;i<spaces.length-1;i++){
           if(ans.length()==0){
               ans.append(s.substring(0,spaces[i]));
               ans.append(' ');
           }
           else {
               ans.append(s.substring(spaces[i-1],spaces[i]));
               ans.append(' ');
           }

        }
        ans.append(s.substring(spaces[spaces.length-2],spaces[spaces.length-1]));
        ans.append(s.substring(spaces[spaces.length-1],s.length()));
        return ans.toString();

    }



    public static void main(String[] args) {
       String s = "icodeinpython";
       int[]spaces = {1,5,7,9};
        System.out.println(addSpaces(s,spaces));
    }
}
