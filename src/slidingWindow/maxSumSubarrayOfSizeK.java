package slidingWindow;

public class maxSumSubarrayOfSizeK {
    public static int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int currSum=sum;
        for(int i=k;i<arr.length;i++){
            currSum+=arr[i];
            currSum-=arr[i-k];
            sum=Math.max(currSum,sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]arr={1,4,2,10,23,3,1,0,20};
        int k=4;
        System.out.println(maxSubarraySum(arr,k));
    }

}
