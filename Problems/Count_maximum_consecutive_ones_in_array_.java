package Problems;
public class Count_maximum_consecutive_ones_in_array_ {
  public static int maxConsecutuiveOnes(int nums[]){
    int cnt = 0;
    int maxi = 0;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] == 1){
        cnt++;
      }
      else{
        cnt = 0;
      }
      
      maxi = Math.max(maxi, cnt);
    }
    return maxi;
  }

  public static void main(String[] args) {
    int[] nums = {1, 1, 0, 1, 1, 1};
    int ans = maxConsecutuiveOnes(nums);
    System.out.println("The Maximum Consecutive one's are: "+ans);
  }
}
