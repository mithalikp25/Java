import java.util.Scanner;

class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows: ");
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) { 
            int p=1;
            for (int c = 1; c <= r; c++) {
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
}
