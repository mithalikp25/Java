import java.util.Scanner;

class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows: ");
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= 2*n-1; c++) {
                if (c <= n-r+1 || c >= n+r-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  
        }
    }
}

// enter the rows: 5
// *********
// **** ****
// ***   ***
// **     **
// *       *