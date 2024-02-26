import java.util.Scanner;

public class Q_11_Sort_arrays_of_Even_and_Odd_ {
  static void printArray(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n; i++){
      System.out.print(arr[i] +" ");
    }
  }
  
  static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void sortEvenAndOdd(int[] arr){
     int n = arr.length;
     int left = 0, right = n-1;
     while(left < right){
      if((arr[left] % 2 == 1) && (arr[right] % 2 == 0)){
        swap(arr, left, right);
        left++;
        right--;
      }
      if(arr[left] % 2 == 0){
        left++;
      }
      if(arr[right] % 2 == 1){
        right--;
      }
     }
  }

   public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter "+ n +" elements");
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }

    System.out.println("Original array: ");
    printArray(arr);

    System.out.println();

    sortEvenAndOdd(arr);
    
    System.out.println("Sorted array: ");
    printArray(arr);
  }
}
