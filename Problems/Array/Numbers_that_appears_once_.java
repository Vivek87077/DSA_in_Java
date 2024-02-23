package Problems.Array;
public class Numbers_that_appears_once_ {
  // ---------1) Linear search approach -----------  Time Complexity: O(N^2)   Space Complexity: O(1) 
  public static int NumbersOccurenceOnce(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {  //Run a loop for selecting elements

      int num = arr[i];     // selected element
      int cnt = 0;

      for (int j = 0; j < n; j++) {  //find the occurrence using linear search
        if(arr[j] == num){
          cnt++;
        }
      }
      if(cnt == 1) return num;      // if the occurrence is 1 return ans
    }
    return -1;
  }


  // ---------2) Using Hashing approach -----------  Time Complexity: O(N)+O(N)+O(N)  Space Complexity: O(maxElement+1)
                                                    
  public static int NumbersOccurenceOnce2(int[] arr) {
    int n = arr.length;  //size of the array

    int maxi = arr[0];   // Find the maximum element
    for(int i = 0; i < n; i++){
      maxi = Math.max(maxi, arr[i]);
    }

    int[] hash = new int[maxi + 1];  // Declare hash array of size maxi+1
    for(int i = 0; i < n; i++){
      hash[arr[i]]++;
    }

    for(int i = 0; i < n; i++){      //Find the single element and return the answer
      if(hash[arr[i]] == 1){
        return arr[i];
      }
    }
    return -1;
    
  }


  // ---------1) Optimal approach(USing XOR) -----------  Time Complexity: O(N)   Space Complexity: O(1) 
  public static int NumbersOccurenceOnce3(int []arr) {
    //size of the array:
    int n = arr.length;

    // XOR all the elements:
    int xorr = 0;                       // a ^ a = 0. ←-Property 1 , 0 ^ a = a.  ←-Property 2
    for (int i = 0; i < n; i++) {
        xorr = xorr ^ arr[i];
    }
    return xorr;
}


  // ---------main function -----------
  public static void main(String[] args) {
    int[] arr = {4, 1, 2, 1, 2};
    int ans = NumbersOccurenceOnce(arr);
    int ans2 = NumbersOccurenceOnce2(arr);
    int ans3 = NumbersOccurenceOnce3(arr);
    System.out.println("The Maximum consecutive One's in array: "+ans);
    System.out.println("The Maximum consecutive One's in array: "+ans2);
    System.out.println("The Maximum consecutive One's in array: "+ans3);
  }
}
