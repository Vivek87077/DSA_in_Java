import java.util.Scanner;

public class j_Count_number_of_element_strictly_greater_than_value_x_ {
    static int greaterElement(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > x){
                count++ ;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] array = new int[n];

            System.out.println("Enter " + n + " element");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("Enter the value of X: ");
            int x = sc.nextInt();
            
            System.out.println("Number of elements strictly greater than value x: "+ greaterElement(array, x));

        }
    }

}
