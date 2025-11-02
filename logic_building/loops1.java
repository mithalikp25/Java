//sum of first n natural numbers. 

package logic_building;

import java.util.*;

public class loops1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int sum=0;

        for(int i=0;i<=a;i++){
            sum=sum+i;
        }
        System.out.println("Sum of first " + a + " natural numbers is: " + sum);
    }
}

//output:
// enter a number
// 10
// Sum of first 10 natural numbers is: 55