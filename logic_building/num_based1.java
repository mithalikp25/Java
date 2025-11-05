//Find the sum of digits of a number. 

package logic_building;

import java.util.*;

public class num_based1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int sum=0;

        for(int i=0;i<=a;i++){
            int rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}

// output:
// enter a number
// 222
// Sum of digits is: 6