package Problems;
public class Find_missing_number_in_an_array_ {
  
  // ---------1) Linear search approach -----------
  public static int missingNumber(int[] a, int n){
    for(int i = 1; i <= n; i++){
      int flag = 0;
      for(int j = 0; j < n-1; j++){
        if(a[j] == i){
          flag = 1;
          break;
        }
      }
      if(flag == 0) return i;
    }
    return -1;
  }


  // ---------2)Using HashMap approach -----------
  public static int missingNumber2(int[] a, int n){
    int hash[] = new int[n+1];
    for(int i = 0; i < n-1; i++){
      hash[a[i]]++;
    }
    for(int i = 1; i <= n ; i++){
      if(hash[i] == 0){
        return i;
      }
    }
    return -1;
  }

  
  // ---------3)Summation approach -----------
  public static int missingNumber3(int[] a, int n){
    int sum = (n*(n+1))/2;
    int s2 = 0;
    for(int i = 0; i < n-1; i++){
      s2 = s2 + a[i];
    }
    int requiredNumber = sum - s2;
    return requiredNumber;
  }


  // ----------main function --------------
  public static void main(String[] args) {
    int n = 5;
    int[] a = {1, 2, 4, 5};
    int ans = missingNumber(a, n);
    int ans2 = missingNumber2(a, n);
    int ans3 = missingNumber3(a, n);
    System.out.println("Missing Number is: " +ans);
    System.out.println("Missing Number is: " +ans2);
    System.out.println("Missing Number is: " +ans3);
  }
}
