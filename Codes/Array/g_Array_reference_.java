import java.util.Scanner;
public class g_Array_reference_ {

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /*  arr[0]; iska mtlb 101 address pe
                   jao aur 101 se zero(0) element ya integer door jo bhi element pada ho lake mujhe dedo
         */
        
        // taking size of the array
         System.out.println("Enter the size of the array: ");
         try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
         
        // taking array element by input 
            System.out.println("Enter " + n + " elements");
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }  
        // print original array
            System.out.println("Original Array");
            printArray(arr);

        // trying to copy arr to arr_2 
            System.out.println("Copied Array");
            int[] arr_2 = arr;        // shallow copy: address ek hota hai variable do hote hai aur dono ek hi ko point karte hai
         // int[] arr_2 = arr.clone();   deep copy:  address aur variable dono alag alag jagah par hai dono array ke liye   
         // int[] arr_2 = Arrays.copyOf(arr, arr.length);
        //  int[] arr_2 = Arrays.copyOfRange(arr, 0, 4);
            printArray(arr_2);     

        // changing some values of arr_2(copied array) 
            arr_2[0] = 0;
            arr_2[1] = 0;
            
            System.out.println("Original array after changing arr_2");
            printArray(arr);

            System.out.println("Copied arr_2 after changing arr_2");
            printArray(arr_2);
            
            /* arr and arr_2 different variable jaroor hai hai but ye dono
            same address ko refer kar rahe hai
            iso ko Reference copy or shallow copy */
        }
    }
}