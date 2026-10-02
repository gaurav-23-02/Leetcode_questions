package BinarySearch;

public class binarySearch {
    public static boolean binarsyS(int[]nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target)return true;
            if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]nums= {-10,3,5,9,12};
        int target=199;
        System.out.println(binarsyS(nums,target));

    }
}
