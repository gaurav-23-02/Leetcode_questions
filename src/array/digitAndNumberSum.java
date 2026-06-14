package array;

public class digitAndNumberSum {
    public static int differenceOfSum(int[] nums) {
        int sum=0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans.append(nums[i]);
        }
        int digSum =0;
        for(int i=0;i<ans.length();i++){
            digSum+=ans.charAt(i)-'0';
        }
        return Math.abs(sum-digSum);

    }
    public static void main(String[] args) {
        int[]nums={1,15,6,3};
        System.out.println(differenceOfSum(nums));
    }
}
