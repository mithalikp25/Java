import java.util.Scanner;

public class pattern12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the rows:");
        int n=sc.nextInt();   
        System.out.print("enter the start number:");
        int m=sc.nextInt();    
        for(int i=1;i<=n;i++){
                for(int s=1;s<=i;s++){
                    System.out.print(" ");
                }
                for(int c=1;c<=2*n-2*i+1;c++){
                    System.out.print(m);
                }
                m--;
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