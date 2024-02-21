public class c_Sum_of_array_element_ {
    public static void main(String[] args) {
    int[] array = {1,5,3};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("Sum of all elements in the array: "+sum);
}
    
    
}
