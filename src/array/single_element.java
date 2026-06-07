package array;

import java.util.*;

public class single_element {
    public static boolean judgeCircle(String moves) {
        int origin=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                origin++;
            }
            if(moves.charAt(i)=='D'){
                origin--;
            }
            if(moves.charAt(i)=='R'){
                origin=origin+2;
            }
            if(moves.charAt(i)=='L'){
                origin=origin-2;
            }
        }
        if(origin==0){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String moves= "RRDD";
        System.out.println(judgeCircle(moves));
    }

}
