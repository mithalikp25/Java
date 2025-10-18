public class transpose {
    public static void main(String[] args) {
        int [][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int [][] transpose = new int[cols][rows]; // swapped dimensions

        // Perform transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // Print transposed matrix
        System.out.println("Transposed matrix:");
        for (int i = 0; i < cols; i++) { // note: use cols first
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// output:
// Transposed matrix:
// 1 4 7 
// 2 5 8 
// 3 6 9 