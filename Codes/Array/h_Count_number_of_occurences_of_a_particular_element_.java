import java.util.Scanner;
public class h_Count_number_of_occurences_of_a_particular_element_ {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter "+ n +" elements: ");
            for(int i = 0; i < arr.length; i++){
              arr[i] = sc.nextInt();
            }

            System.out.println("Enter the value of x: ");
            int x = sc.nextInt();
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == x){
                    count++;
                }
            }
            System.out.println("Count of total occurences: "+ count);
       
        }
    }
    
}
