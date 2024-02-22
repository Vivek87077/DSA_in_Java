package Problems;
public class Longest_subarray_with_given_sum_ {
  //------------------1) Brute Force Approach(Using three loops) ----------------Time Complexity: O(N^3)    Space Complexity: O(1)
  public static int LongestSubarray(int[] arr, int sum){
    int n = arr.length;
    int len = 0;

    for(int i = 0; i < n; i++){

      for(int j = i; j < n; j++){
        int s = 0;

        for(int k = i; k <= j; k++){
          s += arr[k];
        }
        if(s == sum){
          len = Math.max(len, j-i+1);
        }
      }
    }
    return len;
  }


  //------------------1) Brute Force Approach(Using two loops) ---------------------Time Complexity: O(N^2)    Space Complexity: O(1)
  public static int LongestSubarray2(int[] arr, int sum){
    int n = arr.length;
    int len = 0;
    for(int i = 0; i < n; i++){
      int s = 0;
      for(int j = i; j < n; j++){
        s += arr[j];
        if (s == sum){
          len = Math.max(len, j-i+1);
        }
      }
    }
    return len;
  }


  //------------------2) Better Approach(Using Hashing) ---------------------Time Complexity: O(N*logn)    Space Complexity: O(N)


  //------------------3) Optimal Approach(Using two pointer) ---------------------Time Complexity: O(N)    Space Complexity: O(1)
  public static int LongestSubarray3(int []arr, long k) {
    int n = arr.length; // size of the array.

    int left = 0, right = 0; // 2 pointers
    long sum = arr[0];
    int maxLen = 0;
    while (right < n) {
        // if sum > k, reduce the subarray from left
        // until sum becomes less or equal to k:
        while (left <= right && sum > k) {
            sum -= arr[left];
            left++;
        }

        // if sum = k, update the maxLen i.e. answer:
        if (sum == k) {
            maxLen = Math.max(maxLen, right - left + 1);
        }

        // Move forward thw right pointer:
        right++;
        if (right < n) sum += arr[right];
    }

    return maxLen;
}
  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 1, 9};
    int sum = 10;
    int len = LongestSubarray(arr, sum);
    int len2 = LongestSubarray2(arr, sum);
    int len3 = LongestSubarray3(arr, sum);
    System.out.println("The length of the longest subarray is: " + len);
    System.out.println("The lenght of the longest subarray is: "+ len2);
    System.out.println("The lenght of the longest subarray is: "+ len3);
}
}
 
