package array;

import java.util.PriorityQueue;

public class subsequenceOfLengthK {
    public static class Pair{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val =val;
            this.idx =idx;
        }
    }
    public static int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Pair> heap = new PriorityQueue<>((a, b)->Integer.compare(b.val,a.val));
        for(int i=0;i<nums.length;i++){
            heap.add(new Pair(nums[i],i));
        }
        PriorityQueue<Pair>ansHeap = new PriorityQueue<>((a,b)->Integer.compare(a.idx,b.idx));
        while(k>0){
            Pair x = heap.poll();
            ansHeap.add(x);
            k--;
        }
        for(Pair x:ansHeap){
            System.out.println(x.val+" "+x.idx);
        }
        int[]ans = new int[ansHeap.size()];
        int idx=0;
        while(!ansHeap.isEmpty()){
            int x=ansHeap.poll().val;
            ans[idx]=x;
            idx++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]nums={-1,-2,3,4};
        System.out.println(maxSubsequence(nums,3));
    }
}
