import java.util.Scanner;
public class i_Last_occurrence_of_an_element_x_in_given_array_ {
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
            int lastIndex = -1;
            for(int i = 0; i < array.length; i++){
                if(array[i] == x){
                    lastIndex = i;
                }
            }
            System.out.println("last occurrence of element at index: "+ lastIndex);
        }
    }
}