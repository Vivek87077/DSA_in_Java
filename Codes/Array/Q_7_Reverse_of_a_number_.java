public class Q_7_Reverse_of_a_number_ {
  static void printArray(int[] arr){
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static int[] reverseArray(int[] arr){
    int n = arr.length;
    int[] ans = new int[n];
    int j = 0;

    //traversing original array in reverse direction
    // ----By FOR LOOP -----
  /* 
    for(int i = n-1; i >= 0; i--){
      ans[j++] = arr[i];
    }
    return ans;
  */
    // ----By WHILE LOOP -----
    int i = n-1;
    while(i >= 0){
      ans[j++] = arr[i--];
    }
    return ans;
  }

  static void swapInArray(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  
  static void reverseArray2(int[] arr){
    int i = 0, j = arr.length-1;

    while(i < j){
        swapInArray(arr, i, j);
        i++;
        j--;
    }
  }

  public static void main(String[] args) {
   int[] arr = {1, 2, 3, 4, 5};
   int[] ans = reverseArray(arr);
   printArray(ans);

   reverseArray2(arr);
   printArray(arr);


  }
}
