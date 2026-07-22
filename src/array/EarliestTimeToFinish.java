package array;

import java.util.ArrayList;

public class EarliestTimeToFinish {
    public static int earliestTime(int[][] tasks) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<tasks.length;i++){
            int sum=0;
            for(int j=0;j<tasks[0].length;j++){
                sum+=tasks[i][j];
            }
            list.add(sum);
        }
        int min=Integer.MAX_VALUE;
        for(int x:list){
            if(min>x){
                min=x;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[][]tasks = {{1,6},{2,3}};
        System.out.println(earliestTime(tasks));

    }
}
