package Heap;

import java.util.PriorityQueue;

public class maxCapacityWithinBudget {
    public static class Pair{
        int cost;
        int cap;
        Pair(int cost,int cap){
            this.cost=cost;
            this.cap=cap;
        }
    }
    public static int maxCapacity(int[] costs, int[] capacity, int budget) {
        PriorityQueue<Pair>heap = new PriorityQueue<>((a,b)->Integer.compare(b.cap,a.cap));
        for(int i=0;i<costs.length;i++){
            heap.add(new Pair(costs[i],capacity[i]));
        }
        int costSum=0;
        int result=0;
        while(budget>costSum&&heap.peek()!=null){
            Pair x = heap.poll();
            System.out.println(x.cost+" "+x.cap);
            if(x.cost<budget){
                costSum+=x.cost;
                result+=x.cap;
                if(costSum+heap.peek().cost>=budget){
                    heap.poll();
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[]costs={4,8,5,3};
        int[]capacity={1,5,2,7};
        System.out.println(maxCapacity(costs,capacity,8));
    }
}
