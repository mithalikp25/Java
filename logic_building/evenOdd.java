// Take two numbers and determine even/odd combination

package logic_building;

import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a=sc.nextInt(), b=sc.nextInt();

        if(a%2==0 && b%2==0){
            System.out.println("both the entered digits are even");
        }
        else if (a%2!=0 && b%2!=0) {
            System.out.println("both the entered digits are odd");
        }
        else{
            System.out.println("one of the entered digit is odd and the other is even");
        }
    }
}

// output

// enter the two numbers
// 4 6
// both the entered digits are even

// enter the two numbers
// 3 6
// one of the entered digit is odd and the other is even