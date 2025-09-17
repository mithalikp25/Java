//method 1 using p variable

// import java.util.Scanner;

// public class pattern9 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the number:");
//         int n=sc.nextInt();
//         int p=4;
//         for(int rows=1;rows<=n;rows++){
//             for(int cols=1;cols<=n-rows+1;cols++){
//             System.out.print(p);
//         }
//     System.out.println();
//     p--;
//     }
        
//     }
// }


//method 2 

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        
        for(int rows=1;rows<=n+1;rows++){
            for(int cols=1;cols<=n-rows+1;cols++){
            System.out.print(n-rows+1);
        }
    System.out.println();
    
    }
        
    }
}


// output
// 55555
// 4444
// 333
// 22
// 1
