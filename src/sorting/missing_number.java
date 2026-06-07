package sorting;

public class missing_number {
    static int miss(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){//swap when the arr[i] is less than N if N ignore
                int temp = arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;

            }else {
                i++;
            }
        }
        for (int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }return arr.length;
    }
    public static void main(String[] args) {
        int[]arr={4,0,2,1};
        System.out.println(miss(arr));;

    }
}
