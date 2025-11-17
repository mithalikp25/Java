//Java program to check if a number is a Strong Number:

// 145 →
// 1! + 4! + 5!
// = 1 + 24 + 120
// = 145 ✔ Strong number

// 123 →
// 1! + 2! + 3!
// = 1 + 2 + 6
// = 9 ≠ 123 ❌ Not a strong number

package logic_building;

import java.util.*;

public class math6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;

        while(n!=0){
            int fact=1;

            int rem=n%10;
            for(int i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            n=n/10;
        }

        if(sum==temp){
            System.out.print("it is a strong number");
        }
        else{
            System.out.print("it is not a strong number");
        }
    }
}

// output:

// enter a number:145
// it is a strong number

// enter a number:123
// it is not a strong number