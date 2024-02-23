package Problems.Array;
public class Majority_element_that_occurs_more_than_half_times_ {
/*
  public static int majorityElements(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n; i++){
      int cnt = 0;
      for(int j = 0; j < n; j++){
        if(arr[j] == arr[i]){
          cnt++;
        }
      }
      if(cnt >= (n/2)){
        return arr[i];
      }
    }
    return -1;
  }

*/ 
/* 
public static int majorityElements(int[] arr){
  int n = arr.length;
  HashMap<Integer, Integer> mpp = new HashMap<>();
  for(int i = 0; i < n; i++){
    int value = mpp.getOrDefault(arr[i],0);
    mpp.put(arr[i], value + 1);
  }

  for(Map.Entry<Integer, Integer> it: mpp.entrySet()){
    if(it.getValue() > (n/2)){
      return it.getKey();
    }
  }
  return -1;
}
*/

public static int majorityElements(int[] arr){
  //size of the given array:
  int n = arr.length;
  int cnt = 0; // count
  int el = 0; // Element

  //applying the algorithm:
  for (int i = 0; i < n; i++) {
      if (cnt == 0) {
          cnt = 1;
          el = arr[i];
      } else if (el == arr[i]) cnt++;
      else cnt--;
  }

  //checking if the stored element
  // is the majority element:
  int cnt1 = 0;
  for (int i = 0; i < n; i++) {
      if (arr[i] == el) cnt1++;
  }

  if (cnt1 > (n / 2)) return el;
  return -1;
}

  public static void main(String[] args) {
    int[] arr = {2, 2, 1, 1, 1, 2, 2};
    int ans = majorityElements(arr);
    System.out.println("The majority element that occurs more than n/2 times: "+ ans);
  }
}  

