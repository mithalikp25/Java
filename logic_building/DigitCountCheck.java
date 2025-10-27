//Check whether a given integer is single-digit, double-digit, or multi-digit

package logic_building;

import java.util.*;

public class DigitCountCheck {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();

    if(n>=-9&&n<=9){
        System.out.println("given integer is single-digit");
    }
    else if(n>=-99&&n<=99){
        System.out.println("given integer is double-digit");
    }
    else{
        System.out.println("given integer is multi-digit");
    }
    }
}

// output
// enter a number
// 1
// given integer is single-digit

// enter a number
// 22
// given integer is double-digit

// enter a number
// 33333
// given integer is multi-digit
