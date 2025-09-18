import java.util.Scanner;

class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows: ");
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) { 
            for(int s=1;s<=r;s++){
                System.out.print(" ");
            }  // increasing loop, no rows--
            for (int c = 1; c <= n; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//output
// enter the rows: 5
//  *****
//   *****
//    *****
//     *****
//      *****