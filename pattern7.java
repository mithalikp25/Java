import java.util.Scanner;

class pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            int p=70-i;
            for(int j=1;j<=i;j++){
                System.out.print((char)p);
                p++;
            }
            System.out.println();
        }
    }
}

// output
// E
// DE
// CDE
// BCDE
// ABCDE


