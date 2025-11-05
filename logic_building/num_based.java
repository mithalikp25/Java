// Print the product of digits of a given number

package logic_building;

import java.util.*;

public class num_based {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int pro=1;

        for(int i=0;i<=a;i++){
            int rem=a%10;
            pro=pro*rem;
            a=a/10;
        }
        System.out.println("Product of digits is: " + pro);
    }
}

// output:

// enter a number
// 234
// Product of digits is: 24

// enter a number
// 100
// Product of digits is: 0