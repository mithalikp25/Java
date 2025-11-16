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


/*
Edge Cases:
1. Input: 0
   Output: count of digits is: 1
   → Because 0 has exactly one digit.

2. Input: 0000 or 0111
   Output: count of digits is: 1  (for 0000)
           count of digits is: 3  (for 0111)
   → Java removes leading zeros when using nextInt().
     To include all typed zeros, read input as String using nextLine() and use input.length().
*/


// | Task                      | Operator Needed | Why                          |
// | ------------------------- | --------------- | ---------------------------- |
// | Counting digits           | /               | Removes last digit each loop |
// | Getting last digit        | %               | Extracts it                  |
// | Doing both (sum, reverse) | % + /           | Work together                |
