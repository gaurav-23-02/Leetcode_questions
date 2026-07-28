package TwoDArray;

public class twoCityScheduling {
    public static int twoCitySchedCost(int[][] costs) {
        int sum=0;
        for(int i=0;i<costs.length;i++){
            for(int j=0;j< costs.length;j++){
                if(costs[i][j]-costs[i][j+1]>0){
                    sum+=costs[i][j];
                }
                else{
                    sum+=costs[i][j+1];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][]costs={{10,20},{30,200},{400,50},{30,20}};
        System.out.println(twoCitySchedCost(costs));
    }
}
