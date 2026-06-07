package search;

public class ReverseRotate {
    static void reverse(int[]arr,int start ,int end){
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    static void rotate(int[]arr,int k){
        int n=arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr, n-k,n-1);
        reverse(arr,0, n-1);

    }


    public static void main(String[] args) {
        int []arr={0,0,0,0,1,1,1,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        rotate(arr,4);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
    }
}
