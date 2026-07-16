package array;

import java.util.Scanner;

public class noOfSunday {
    public static int sundayNumber(String day,int date){
        int[]week = new int[7];
        int mon=0,tue=0,wed=0,thu=0,fri=0,sat=0,sun=0;
        week[0]=mon;week[1]=tue;week[2]=wed;week[3]=thu;week[4]=fri;week[5]=sat;week[6]=sun;
        for(int i=0;i<7;i++){
            week[i]=mon++;
        }
        return week[6];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int date = sc.nextInt();
        System.out.println(sundayNumber(day,date));
    }
}
