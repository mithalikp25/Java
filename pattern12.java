import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the rows:");
        int rows = sc.nextInt();
        
        System.out.print("enter the start number:");
        int n = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * (rows - i) + 1; c++) {
                System.out.print(n);
            }
            n--; 
            System.out.println();
        }
    }
}


// output
// enter the rows:5
// enter the start number:6
//  666666666
//   5555555
//    44444
//     333
//      2