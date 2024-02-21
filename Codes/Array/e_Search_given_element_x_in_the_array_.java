public class e_Search_given_element_x_in_the_array_ {

    // Linear Searching algorithm
    public static void main(String[] args) {
        int[] array = {1, 5, 3};
        int x = 5;
        int ans = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == x){
             ans = i;
            }
        }    

         System.out.println("Found "+ x + " at index " +ans);   
    }
    
}
