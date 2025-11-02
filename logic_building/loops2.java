//sum of all even numbers up to n. 

package logic_building;

import java.util.*;

public class loops2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int sum=0;

        for(int i=0;i<=a;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of all even numbers up to " + a + " is: " + sum);
    }
}

// output:
// enter a number
// 10
// Sum of all even numbers up to 10 is: 30