//the factorial of a given number. 

package logic_building;

import java.util.*;

public class loops4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int fact=1;

        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of " + a + " is: " + fact);
    }
}


// output:
// enter a number
// 10
// Factorial of 10 is: 3628800