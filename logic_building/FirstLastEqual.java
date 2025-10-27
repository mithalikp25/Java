//Take a 4-digit number and check if the first and last digits are equal.

package logic_building;

import java.util.*;

public class FirstLastEqual {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a four digit number");
    int n=sc.nextInt();
    
    int a=n/1000;
    int b=n%10;

    if(a==b){
        System.out.println("first and last digits are equal.");
    }
    else{
        System.out.println("first and last digits are not equal.");
    }
    }
}

// output:
// enter a four digit number
// 1221
// first and last digits are equal.

// enter a four digit number
// 1235
// first and last digits are not equal.
