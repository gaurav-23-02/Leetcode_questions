package Heap;
import java.util.*;
public class introduction {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            minHeap.add(arr[i]);
        }
        System.out.println(minHeap);

        System.out.println(Arrays.toString(arr));

    }
}
