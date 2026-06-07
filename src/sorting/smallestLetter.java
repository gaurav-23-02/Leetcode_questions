package sorting;

import java.util.*;
public class smallestLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int maxCount = 0;
        int currentCount = 0;

        while (n > 0) {
            if ((n & 1) == 1) {  // check if last bit is 1
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0; // reset if bit is 0
            }
            n >>= 1; // right shift
        }

        System.out.println("Longest sequence of 1s: " + maxCount);
    }
}



