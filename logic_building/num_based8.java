//Write a program to print Fibonacci series up to n terms.

package logic_building;

import java.util.*;

public class num_based8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter range of required fibonacci sequence:");
        int n=sc.nextInt();
        int a=0;
        int b=1;

        for(int i=0;i<=n;i++){
            System.out.print(a + " ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}

// output:

// enter range of required fibonacci sequence:10
// 0 1 1 2 3 5 8 13 21 34 55 

// enter range of required fibonacci sequence:7
// 0 1 1 2 3 5 8 13 