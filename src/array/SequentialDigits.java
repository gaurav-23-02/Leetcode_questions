package array;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static List<Integer> sequentialDigits(int low, int high) {
        int[]arr={12,23,34,45,67,78,89,123,234,345,456,567,678,789,
                1234,2345,3456,4567,5678,6789,12345,23456,34567,45678,56789,123456,234567,
                345678,456789,1234567,2345678,3456789,1234567,2345678,3456789,12345678,23456789,123456789};
        int i=0;
        int x=0;
        List<Integer>list=new ArrayList<>();
        while(arr[i]<low){
            x=arr[i];
            i++;
        }
        if(arr[i]==low){
            list.add(arr[i-1]);
            System.out.println(arr[i]);
        }
        System.out.println(i);
        System.out.println(x);
        while(arr[i]<=high){
            list.add(arr[i]);
            i++;
        }
        System.out.println(arr[i]);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(sequentialDigits(234,2314));
    }
}
