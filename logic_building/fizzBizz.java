///FizzBuzz

package logic_building;

import java.util.*;

public class fizzBizz {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();

        if(a%3==0){
            System.out.println("fizz");
        }
        else if(a%5==0){
            System.out.println("buzz");
        }
        else if((a%3==0)&&(a%5==0)){
            System.out.println("fizzbuzz");
        }
      }
}
