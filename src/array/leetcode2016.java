package array;

public class leetcode2016 {
    public static int maximumDifference(int[] nums) {
        int diff=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    diff=Math.max(nums[j]-nums[i],diff);
                }
            }
        }
        return diff;

    }

    public static void main(String[] args) {
        int[]nums={7,1,5,4};
        System.out.println(maximumDifference(nums));
    }
}
