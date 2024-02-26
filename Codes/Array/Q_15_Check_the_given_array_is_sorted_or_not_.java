import java.util.Scanner;

public class Q_15_Check_the_given_array_is_sorted_or_not_ {

    static boolean isSorted(int[] array){
        boolean check = true;
        for(int i = 1; i < array.length; i++){
                 if(array[i] < array[i-1]){
                    check = false;
                    break;
                 }
         }
         return check;
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
            
            System.out.println("Array is sorted: "+ isSorted(array));
        }    
    }
}
