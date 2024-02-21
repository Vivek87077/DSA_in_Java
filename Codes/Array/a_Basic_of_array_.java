public class a_Basic_of_array_{
    public static void main(String[] args) {
          
        int[] ages = new int[3];     // Decleration of 1D array
        // int[] ages = {25, 35, 18};   // Decleartion of 1D array in lateral way 
        // float[] weights = new float[3];
        // String[] names = new String[3];

        ages[0] = 34;              // Accessing value of 1D array 
        // ages[5] = 45;           Index 5 out of bounds for length 3

        int[][] multiArray = new int[3][3]; // Decleration of 2D array
        // int[][] multiArray = {{56,43,6}, {34,7,8}, {12,56,8}}; //Decleration of 2D array in a lateral way 
        
        multiArray[1][2] = 32;     // Accessing value of 2D array
                  

        System.out.println(ages[0]);
        System.out.println(multiArray[1][2]);

        System.out.println(ages.length);

    } 
}