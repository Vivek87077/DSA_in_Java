//  Target Sum

import java.util.Scanner;
public class Q_2_Target_tripplet_Sum_ {
    static int pairSum(int[] arr, int target){
        int n = arr.length;

        int ans = 0;
        for(int i = 0; i <= n-1; i++){  // pick first number 
            for(int j = i+1; j <= n-1; j++)  // second number6
             for(int k = j+1; k <= n-1; k++){
              if(arr[i] + arr[j] + arr[k] == target){
                ans++;
              }
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

            System.out.println("Enter target sum ");
            int target = sc.nextInt();

            System.out.println("Number of pairs : " + pairSum(arr, target));

        }
    }
}