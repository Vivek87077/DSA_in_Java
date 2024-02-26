import java.util.Scanner;
public class Q_13_Last_occurrence_of_an_element_x_in_given_array_ {
    static int lastOccurences(int[] arr, int x){
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] array = new int[n];
            
            System.out.println("Enter the "+ n +" elements");
            for(int i = 0; i < array.length; i++){
                array[i] = sc.nextInt();
            }
            
            System.out.println("Enter the value of x: ");
            int x = sc.nextInt();
            
            System.out.println("last occurrence of element at index: "+ lastOccurences(array, x));
        }
    }
}