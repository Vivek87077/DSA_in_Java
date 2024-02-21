public class d_Maximum_value_out_of_all_elements_in_the_array_ {
   public static void main(String[] args) {
     int[] array = {1, 5, 3};
     int ans = 0;
     for(int i = 0; i < array.length; i++){
        if(array[i] > ans){
            ans = array[i];
        }
     }
     System.out.println("Maximum value: "+ans);
   } 
}
