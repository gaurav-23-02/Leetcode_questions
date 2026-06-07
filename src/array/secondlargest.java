package array;

public class secondlargest {
    public static int second(int []arr){
        int largest = arr[0];
        int secondlar=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>secondlar && arr[j]!=largest){
                secondlar=arr[j];
            }
        }
        return secondlar;
    }

    public static void main(String[] args) {
        int []arr={1,2,4,7,7,5};
        System.out.println(second(arr));
    }
}
