//Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits. 

package logic_building;

import java.util.*;

public class sumpro {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter an integer");
    int x=sc.nextInt();
    int sum=0;
    int pro=1;
    int value=x;

        while(value>0){
            int digit=value%10;
            sum=sum+digit;
            pro=pro*digit;
            value=value/10;
        }
   if (sum > pro) {
            System.out.println("Sum of digits is greater than the product of digits.");
        } else {
            System.out.println("Sum of digits is not greater than the product of digits.");
        }
        }
    }

//here we've taken a new variable value so that the original input x remains unchanged for any further use if needed.

// output:
// enter an integer
// 111  
// Sum of digits is greater than the product of digits.

// enter an integer
// 999
// Sum of digits is not greater than the product of digits.