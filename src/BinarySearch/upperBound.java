package BinarySearch;

public class upperBound {
    public static int upper(int[]nums,int target){
        int low =0;
        int high=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)min=Math.min(nums[mid],min);
            if(nums[mid]>target)min=Math.min(nums[mid+1],min);
            if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(min!=Integer.MAX_VALUE)return min;
        return -1;
    }
    public static void main(String[] args) {
        int[]nums={3,5,7,10,12,20,31,50,60,80,90,100};
        int target=300;
        System.out.println(upper(nums,target));
    }
}
