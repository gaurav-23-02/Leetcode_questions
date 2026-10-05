package GreedyAlgo;

import java.util.Arrays;

public class boatToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        for(int i=0;i<people.length-1;i++){
            if(people[i]+people[i+1]<=limit){
                count++;
                i++;
            }
            if(people[i]+people[i+1]>limit){
                count+=2;
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]people={3,2,2,1};
        int limit=3;
        System.out.println(numRescueBoats(people,limit));
    }
}
