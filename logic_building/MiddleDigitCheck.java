//Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.

package logic_building;

import java.util.*;

public class MiddleDigitCheck {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a three digit number");
    int n=sc.nextInt();   

    int a=n/100;
    int b=(n/10)%10;
    int c=n%10;

    if((b>c)&&(b>a)){
        System.out.println("the middle digit is the largest");
    }
    else if ((b<c)&&(b<a)) {
         System.out.println("the middle digit is the smallest");
    }
    else{
        System.out.println("middle digit is neither the smallest nor the largest");
    }
    }
}

// output:
// enter a three digit number
// 153
// the middle digit is the largest
