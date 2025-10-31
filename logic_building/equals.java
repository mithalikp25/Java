//7.	Take a 3-digit number and check if the sum of the first and last digit equals the middle digit. 

package logic_building;

import java.util.*;

public class equals {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a three digit number");
        int n=sc.nextInt();

        int first=n/100;
        int second=(n%100)/10;
        int third=n%10;

        if(first+third==second){
            System.out.println("sum of first and third digit is equal to second digit");
        }
        else{
            System.out.println("sum of first and third digit is not equal to second digit");
        }
    }
}

// output
// enter a three digit number
// 123
// sum of first and third digit is not equal to second digit

// enter a three digit number
// 132
// sum of first and third digit is equal to second digit
