import java.util.Scanner;
public class pattern10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        
        for(int rows=1;rows<=n+1;rows++){
            int p=rows;
            for(int s=1;s<=n-rows+1;s++){
                System.out.print(" ");
            }
            for(int cols=1;cols<=rows;cols++){
            System.out.print(p);
            p++;
        }
        for(int cols=1;cols<=rows-1;cols++){
            System.out.print(p-2);
            p--;}
    System.out.println();
    
    }
        
    }
}

// output
//     1
//    232
//   34543
//  4567654
// 567898765


import java.util.Scanner;
public class pattern10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        
        for(int rows=1;rows<=n+1;rows++){
            int p=65;
            for(int s=1;s<=n-rows+1;s++){
                System.out.print(" ");
            }
            for(int cols=1;cols<=rows;cols++){
            System.out.print((char)p);
            p++;
        }
        for(int cols=1;cols<=rows-1;cols++){
            System.out.print((char)(p-2));
            p--;}
    System.out.println();
    
    }
        
    }
}

// output
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA