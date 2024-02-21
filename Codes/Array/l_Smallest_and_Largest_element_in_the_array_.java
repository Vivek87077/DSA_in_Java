import java.util.Arrays;
import java.util.Scanner;

public class l_Smallest_and_Largest_element_in_the_array_ {

    static int[] smallestAndLargestElement(int[] array){
        Arrays.sort(array);
        int[] ans = {array[0], array[array.length-1]};
        return ans;
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
            
            
            System.out.println("Smallest Element: "+ array[0]);
            System.out.println("Largest Element: "+ array[array.length - 1]);

        }
    }
}
