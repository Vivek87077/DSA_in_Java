// Array Manipulation
// Find the second largest element in the given array

import java.util.Scanner;

public class Q_4_Second_largest_element_ {

    static int findMax(int[] arr) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecondMax(int[] arr) {
        int mx = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Largest Number is: " + findMax(arr));
            System.out.println("Second Largest Number is: " + findSecondMax(arr));
        }

    }

}
