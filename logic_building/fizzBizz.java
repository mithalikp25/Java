///FizzBuzz

package logic_building;

import java.util.*;

public class fizzBizz {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();

        if((a%3==0)&&(a%5==0)){
            System.out.println("fizzbuzz");
        }
        else if(a%5==0){
            System.out.println("buzz");
        }
        else if((a%3==0)){
            System.out.println("fizz");
        }
      }
}

// Output:

// enter a number
// 3
// fizz

// enter a number
// 5
// buzz

// enter a number
// 15
// fizzbuzz