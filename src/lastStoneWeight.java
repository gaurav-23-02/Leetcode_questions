import java.util.PriorityQueue;

public class lastStoneWeight {
    public static int lastStoneWeight1(int[] stones) {
        PriorityQueue<Integer>heap = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int x:stones){
            heap.add(x);
        }
        while(heap.size()>1){
            int x=heap.poll();
            int y=heap.poll();
            if(x!=y){
                System.out.println(x-y);
                heap.add(x-y);
            }

        }
        if(heap.size()==0)return 0;
        return heap.poll();
    }
    public static void main(String[] args) {
        int[]stones ={2,7,4,1,8,1};
        System.out.println(lastStoneWeight1(stones));
    }
}
