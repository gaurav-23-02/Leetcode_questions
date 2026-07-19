package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class reverseVowels {
    public static int reverseVowels1(String startTime,String endTime) {
        String[]start=startTime.split(":");
        String[]end=endTime.split(":");
        int[]s=new int[start.length];
        int idx=0;
        for(String x:start){
            s[idx++]=Integer.parseInt(x);
        }
        int[]e=new int[start.length];
        System.out.println(Arrays.toString(s));
        idx=0;
        for(String x:end){
            e[idx++]=Integer.parseInt(x);
        }
        System.out.println(Arrays.toString(e));
        int hour=(e[0]-s[0])*3600;
        System.out.println(hour);
        int min =(e[1]-s[1])*60;
        int sec =e[2]-s[2];
        System.out.println(Arrays.toString(start));
        return hour+min+sec;
    }

    public static void main(String[] args) {
       String startTime = "01:00:00", endTime = "01:00:25";
        System.out.println(reverseVowels1(startTime,endTime));
    }
}
