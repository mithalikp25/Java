import java.util.Scanner;

class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            // print spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
// int p=1;
            // print numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
                // p++;
            }

            System.out.println();
        }
    }
}


// output
//     1
//    12
//   123
//  1234
// 12345