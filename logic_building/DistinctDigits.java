//Check if all digits in a 3-digit number are different.

package logic_building;

import java.util.*;

public class DistinctDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a three digit number");
        int n=sc.nextInt();

        int first=n/100;
        int second=(n%100)/10;
        int third=n%10;

        // int first = n / 100;
        // int second = (n / 10) % 10;
        // int third = n % 10;

        if((first!=second) && (second!=third) && (first!=third)){
            System.out.println("all are distinct elements");
        }
        else{
            System.out.println("the elements of the digit are not distinct");
        }
    }
}

// output
// enter a three digit number
// 123
// all are distinct elements