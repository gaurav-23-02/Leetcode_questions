package TCSNQTPYQ;

import java.util.*;

public class jumpGameN {
    public static int Maximize(String number,char digit){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                String temp = number.substring(0,i)+number.substring(i+1);
                int val=Integer.parseInt(temp);
                if(val>max){
                    max=val;
                }
            }
        }

        Queue<Integer>q= new LinkedList<>();
        return max;
    }
    public static void main(String[] args) {
        String number="5432631";
        char digit='3';
        System.out.println(Maximize(number,digit));
    }
}
