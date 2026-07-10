package array;

public class twoPointer {
    public static int getCommon(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums1={1,1,2};
        int[]nums2={2,4};
        System.out.println(getCommon(nums1,nums2));
    }
}
