public class transposeofmatrix {
    public static void main(String[] args) {
        int array[][] = {{4, 7, 8}, {8, 8, 7}};
        
        // Print the original array
        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Create a new array to store the transpose
        int transpose[][] = new int[array[0].length][array.length];

        // Perform the transpose operation
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                transpose[j][i] = array[i][j];
            }
        }

        // Print the transposed array
        System.out.println("Transposed Array:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
