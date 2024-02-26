// Array Manipulation

import java.util.Scanner;
public class Q_3_Unique_element {
    static int findUnique(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){  // pick first number 
            for(int j = i+1; j < n; j++){   // second number6
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        
        int ans = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
               ans = arr[i];
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            
            System.out.println("Unique Numbers are : " + findUnique(arr));

        }
    }
} 