// Given a square matrix, calculate the absolute difference between the sums of its diagonals.

// For example, the square matrix  is shown below:

// 1 2 3
// 4 5 6
// 9 8 9  
// The left-to-right diagonal = 1+5+9.
// The right-to-left diagonal = 3+5+9.
// Their absolute difference is |15-17|=2.


package hacker_rank;

import java.util.*;

public class hacker3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum1 += arr[i][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1) {
                    sum2 += arr[i][j];
                }
            }
        }

        int abso = Math.abs(sum1 - sum2);
        System.out.println(abso);
    }
}

// output:
// 3
// 11 2 4
// 4 5 6        
// 10 8 -12
// ->output::15