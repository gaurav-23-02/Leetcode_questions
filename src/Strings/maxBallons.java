package Strings;

import java.util.Arrays;

public class maxBallons {
    public static int maxNumberOfBalloons(String text) {
        int[]balloon=new int[5];
        int b=0,a=0,l=0,o=0,n=0;
        for(Character x:text.toCharArray()){
            if(x=='b')b++;
            if(x=='a')a++;
            if(x=='l')l++;
            if(x=='o')o++;
            if(x=='n')n++;
        }
        System.out.println(b+""+a+""+l+""+o+""+n);
        return Math.min(Math.min(b,a),(Math.min(Math.min(l/2,o/2),n)));
    }
    public static void main(String[] args) {
        String text="loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }
}
