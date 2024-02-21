public class b_Traversing_of_array_ {
    public static void main(String[] args) {

        // Single dimensional array     
        int[] ages = new int[3]; // Deceration of the array

        ages[0] = 32;
        ages[1] = 12; // Assigning the value
        ages[2] = 25;

        for (int i = 0; i < ages.length; i++) { // Traversing through array
            System.out.println(ages[i]); // Print all the value of the array
        }

        // For Each loop method to traversing

        for (int age : ages) {
            System.out.println(age);
        }

        // While loop method
        int i = 0;
        while (i < ages.length) {
            System.out.println(ages[i]);
            i = i + 1;
        }

        // Multi Dimensional array
        int[][] arr = {{56, 43, 6},{34, 7, 8}};  //Decleration of 2D array

        for(i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

        /* two type of memory:-> 1)Heap 2)stack
           actual mein memory ya stirage jo mili hai wo heap mein mili hai 
           but uska reference stack mein hai
           Stack:- stack stores primitive data type,function call,reference variable
           Heap:- allocate objects 
        */ 

        
    

    }

}
