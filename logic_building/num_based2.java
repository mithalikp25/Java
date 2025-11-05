//Count the number of digits in a given number. 

package logic_building;

import java.util.*;

public class num_based2  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int count=0;

           if (a == 0) {
            count = 1;  // because 0 has 1 digit
        }
        else 
         {
            while (a != 0) {
                a = a / 10;
                count++;
            }
        }
        
        System.out.println("count of digits is: " + count);
    }
}


// output:
// enter a number
// 234543
// count of digits is: 6

// enter a number
// 1000
// count of digits is: 4