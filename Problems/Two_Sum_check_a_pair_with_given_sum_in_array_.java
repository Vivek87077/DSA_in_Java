package Problems;
public class Two_Sum_check_a_pair_with_given_sum_in_array_{

  //------------------1) Brute Force Approach ---------------Time Complexity: O(N^2)   Space Complexity: O(1)
  public static int[] twoSum1(int n, int[] arr, int target){
    int[] ans = new int[2];
    ans[0] = ans[1] = -1;
    for(int i = 0; i < n; i++){
      for(int j = i + 1; j < n; j++){
        if((arr[i] + arr[j]) == target){
          ans[0] = i;
          ans[1] = j;
          return ans;
        }
      }
    }
    return ans;
  }

  //------------------1) Optimal Approach ---------------Time Complexity: O(N) + O(N*logN)   Space Complexity: O(1)
  public static int[] twoSum2(int n, int[] arr, int target){
    int[] ans = new int[2];
    ans[0] = ans[0] = -1;
    int left = 0, right = n-1;
    while(left < right){
      int sum = arr[left] + arr[right];
      if(sum == target){
        ans[0] = left;
        ans[1] = right;
      }
      else if(sum < target){
        left++;
      }
      else{
        right++;
      }
    }
    return ans;
  }

  
  public static void main(String[] args) {
    int n = 5;
    int[] arr = {2, 6, 5, 8, 11};
    int target = 14;
    int[] ans1 = twoSum1(n, arr, target);
    System.out.println("This is the answer for variant 2: [" + ans1[0] + ", " + ans1[1] + "]");
    int[] ans2 = twoSum2(n, arr, target);
    System.out.println("This is the answer for variant 2: [" + ans2[0] + ", " + ans2[1] + "]");
                           
  }
}