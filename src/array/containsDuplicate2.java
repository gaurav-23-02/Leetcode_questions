package array;

import java.util.Arrays;

public class containsDuplicate2 {
    public static int[] scoreValidator(String[] events) {
        int[]ans=new int[2];
        int score=0;
        int counter=0;
        for(int i=0;i<events.length;i++){
            if(events[i].equals("0")||events[i].equals("1")||events[i].equals("2")||events[i].equals("3")||events[i].equals("4")||events[i].equals("5")||events[i].equals("6")){
                score=score+Integer.parseInt(events[i]);
            }
            else if(events[i]=="W"){
                counter++;
            }
            else if(events[i]=="WD"){
                score++;
            }
            else{
                score++;
            }
        }
        ans[0]=score;
        ans[1]=counter;
        System.out.println(Arrays.toString(ans));
        return ans;

    }

    public static void main(String[] args) {
        String[]events={"1","4","W","6","WD"};
        System.out.println(scoreValidator(events));
    }
}
