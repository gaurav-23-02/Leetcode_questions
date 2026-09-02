package slidingWindow;

public class leetcode_219 {
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(Math.abs(i-j)<=k){
                        ans=1;
                    }
                }
            }
        }
        if(ans==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,1,2,3};
        int k=2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
