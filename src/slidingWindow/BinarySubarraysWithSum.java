package slidingWindow;

public class BinarySubarraysWithSum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        int i=0;
        int j=0;
        int sum=0;
        while (j<nums.length){
            sum+=nums[j];
            if(sum==goal){
                count++;
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,0,1,0,1};
        System.out.println(numSubarraysWithSum(nums,2));

    }
}
