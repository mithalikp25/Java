//program to find armstrong number 
//Armstrong number is a number that is equal to the sum of cubes of its own digits.
//For example, 153 is an Armstrong number, because 1^3 + 5^3 + 3^3 = 153.

package logic_building;

import java.util.*;

public class num_based6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;

        int len=String.valueOf(n).length();

        while(temp!=0){
            int r=temp%10;          // get last digit
            sum+=Math.pow(r, len); // cube (or power) of digit
            temp=temp/10;         // remove last digit
        }
        if(sum==n){
            System.out.println(n + " is an Armstrong number");
        }
        else{
            System.out.println(n + " is not an Armstrong number");
        }
    }
}

// // output:

// enter a number: 123
// 123 is not an Armstrong number

// enter a number: 153
// 153 is an Armstrong number