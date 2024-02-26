import java.util.Scanner;

public class Q_9_Present_Query_or_not_ {
  static int[] makeFrequencyArray(int[] arr){
    int n = arr.length;
    int[] freq = new int[100005];
    for(int i = 0; i < n; i++){
      freq[arr[i]]++;
    }
    return freq;
  }
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter "+ n +" elements");
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }

    int[] freq = makeFrequencyArray(arr);

    System.out.println("Enter number of queries ");
    int q = sc.nextInt();

    while(q > 0){
      System.out.println("Enter number to be searched");
      int x = sc.nextInt();
      if(freq[x] > 0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
      q--; 
    }
  }
}
