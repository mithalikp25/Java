//Write a program to print Fibonacci series up to n terms.

package logic_building;

import java.util.*;

public class num_based9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter range of required fibonacci sequence:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;

       for (int i = 1; i <= n; i++) // loop runs n times
       {  
            System.out.print(a + " ");  // print current number
            sum += a;                   // adds current value to sum
            int c = a + b;              // next term = previous two
            a = b;                      // shift a to b
            b = c;                      // shift b to next
       }
        System.out.println("\nSum of series up to " + n + " terms is: " + sum);
    }
}

// output:

// enter range of required fibonacci sequence:7
// 0 1 1 2 3 5 8 
// Sum of series up to 7 terms is: 20

// enter range of required fibonacci sequence:10
// 0 1 1 2 3 5 8 13 21 34 
// Sum of series up to 10 terms is: 88
 