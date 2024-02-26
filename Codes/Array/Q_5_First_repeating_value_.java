// First Value that is Repeting in the array
import java.util.Scanner;
public class Q_5_First_repeating_value_ {
    static int firstRepetingNumber(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){  // pick first number 
            for(int j = i+1; j < n; j++){   // second number6
              if(arr[i] == arr[j]){
                 return arr[i];
                }
            }
        }
        return -1;
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

            System.out.println("First Repeting Number : " + firstRepetingNumber(arr));

        }
    }
}