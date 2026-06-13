package array;

import java.util.Arrays;

public class count {
    public static int minimumCost(int[] cost) {
        int sum=0;
        if(cost.length<3){
            for(int i=0;i<cost.length;i++){
                sum+=cost[i];

            }

        }
        Arrays.sort(cost);
        int skip=cost.length-3;
        for(int i=cost.length-1;i>=0;i--){
            if(i!=skip){
                sum+=cost[i];
            }
            else {
                skip-=3;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] cost={6,5,7,9,2,2};
        System.out.println(minimumCost(cost));
    }
}
