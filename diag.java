import java.util.*;

public class diag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println(); 
        }

        System.out.println("the elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Left diagonal
        System.out.print("the left diagonal elements of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println(); // move to next line

        // Right diagonal
        System.out.print("the right diagonal elements of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1) {//if i want to prevent 5 from being printed again then i can use   if (i + j == arr.length - 1 && i != j)
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println(); // move to next line
    }
}


// output:
// enter the number of rows: 3
// enter the number of columns: 3
// enter the elements of the array: 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9

// the elements of the array are :
// 1 2 3
// 4 5 6
// 7 8 9
// the left diagonal elements of the array are: 1 5 9
// the right diagonal elements of the array are: 3 5 7