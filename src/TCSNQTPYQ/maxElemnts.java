package TCSNQTPYQ;
import java.util.*;
public class maxElemnts {
    public static int max(int[]nums){
        int max=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(max(nums));
    }
}
