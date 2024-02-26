public class a_Basic_of_array_{
    public static void main(String[] args) {
          
        // int[] ages = new int[3];     // Decleration of 1D array
        int[] ages = {25, 35, 18};   // Decleartion of 1D array in lateral way 

        // ages[0] = 34;              // Accessing value of 1D array 
        // ages[5] = 45;           Index 5 out of bounds for length 3

        // int[][] multiArray = new int[3][3]; // Decleration of 2D array
        int[][] multiArray = {{56,43,6}, {34,7,8}, {12,56,8}}; //Decleration of 2D array in a lateral way 
        
        // multiArray[1][2] = 32;     // Accessing value of 2D array
        // System.out.println(ages[0]);
        // System.out.println(multiArray[1][2]);
        // System.out.println(ages.length);

        //------------- Traversing through the array--------------
        //------1) For loop -------
        for(int i = 0; i < 3; i++){
            System.out.print(ages[i]+" ");
        }

        System.out.println();

        //------2) For each loop -------
        for(int age : ages){
            System.out.print(age + " ");
        }

        System.out.println();

        //------3) while loop ----------
        // int i = 0;
        // while(i < 3){
        //     System.out.print(ages[i] + " ");
        //     i = i + 1;
        // }

        for(int i = 0; i < multiArray.length; i++){
            for(int j = 0; j < multiArray[i].length; j++){
                System.out.print(multiArray[i][j] + " ");
            }
        }
        
    } 
}