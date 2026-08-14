package slidingWindow;

public class leetcode_643 {
    public static double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int best =sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            best=Math.max(sum,best);
        }
        double avg=(double)best/k;
        return avg;
    }

    public static void main(String[] args) {
        int[]nums={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
}
