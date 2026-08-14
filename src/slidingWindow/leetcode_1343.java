package slidingWindow;

public class leetcode_1343 {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        double avg =(double) sum/k;
        if(avg>=threshold){
            count++;
        }
        for(int j=k;j<arr.length;j++){
            sum-=arr[j-k];
            sum+=arr[j];
            System.out.println(sum);
            avg=(double) sum/k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr = {2,2,2,2,5,5,5,8};
        int k = 3, threshold = 4;
        System.out.println(numOfSubarrays(arr,k,threshold));
    }
}
