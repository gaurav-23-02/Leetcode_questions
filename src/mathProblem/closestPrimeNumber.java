package mathProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class closestPrimeNumber {
    public static boolean isPrime(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static int[] closestPrime(int left,int right){
        List<Integer> list =  new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        int min=-1;
        int max=-1;
        int diff=Integer.MAX_VALUE;
        int minDiff =Integer.MAX_VALUE;
        PriorityQueue<int[]>heap = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<list.size()-1;i++){
            minDiff=Math.min(minDiff,list.get(i+1)-list.get(i));
        }
        for(int i=0;i<list.size()-1;i++){
            int newDiff = list.get(i+1)-list.get(i);
//            System.out.println(newDiff);
            if(newDiff==minDiff){
                heap.add(new int[]{list.get(i),list.get(i+1)});
            }
            diff=Math.min(diff,newDiff);
//            System.out.println(diff);
            min=list.get(i);
            max=list.get(i+1);
        }
        for(int[]x:heap){
            System.out.println(Arrays.toString(x));
        }
        System.out.println(heap.size());
        if(heap.size()!=0)return heap.peek();
        return new int[]{max,min};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(closestPrime(18,72)));
    }
}
