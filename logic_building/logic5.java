//Find the smallest and largest digit in a given number

package logic_building;

import java.util.*;

public class logic5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int min= Integer.MAX_VALUE;
        int max=0;

        while(n!=0){
            int rem=n%10;
            min=Math.min(rem,min);
            max=Math.max(rem,max);
            n=n/10;
        }

        System.out.println(min);
        System.out.println(max);
    }
}


// Output:

// enter the number:256
// 2
// 6

// enter the number:886240
// 0
// 8