package array;

import java.util.Arrays;

public class medianOfTwoSortedArras {
    public static double mergeSortedArrays(int[] a, int[] b) {
        int n = a.length, m = b.length;
        double[] res = new double[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }

        // remaining elements
        while (i < n) res[k++] = a[i++];
        while (j < m) res[k++] = b[j++];

        System.out.println(Arrays.toString(res));
        int mid=res.length-1;
        if(res.length%2!=0){
            return res[mid/2];
        }
        else{
            return (res[mid/2]+res[(mid/2)+1])/2;
        }
    }

    public static void main(String[] args) {
        int[] nums1={1,2};
        int []nums2={3};
        System.out.println((mergeSortedArrays(nums1,nums2)));
    }

}
