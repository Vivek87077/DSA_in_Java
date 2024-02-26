import java.util.Scanner;

public class Q_10_Sort_arrays_of_0s_and_1s_ {

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

  static void sortZerosAndOnesInplace(int[] arr){
    int n = arr.length;
    int Zeros = 0;
    //count number of Zeros
    for(int i = 0; i < n; i++){
      if(arr[i] == 0){
        Zeros = Zeros + 1;
      }
    }
    // 0 to (Zeros-1) : 0, Zeros to (n-1) : 1
    for(int i = 0; i < n; i++){
      if(i < Zeros){
        arr[i] = 0;
      }
      else{
        arr[i] = 1;
      }
    }
  }
  
  static void sortZerosAndOnes(int[] arr){
    int n = arr.length;
    int left = 0, right = n-1;
    while(left < right){
      if(arr[left] == 1 && arr[right] == 0){
        swap(arr, left, right);
        left++;
        right--;
      }

      if(arr[left] == 0){
        left++;
      }

      if(arr[right] == 1){
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

    // sortZerosAndOnesInplace(arr);
    sortZerosAndOnes(arr);
    
    System.out.println("Sorted array: ");
    printArray(arr);
  }
}
