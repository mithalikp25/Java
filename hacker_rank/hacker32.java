// Find Digits 

// You are given a number. Look at each digit in that number and ask:
// “Does this digit divide the number evenly?”
// Count all the digits that do.
// Ignore any digit that is zero, because dividing by zero isn’t allowed.
// Repeat this for each number you are given.

// Example:

// For 12 → digits are 1 and 2. Both divide 12 → count = 2.
// For 1012 → digits are 1, 0, 1, 2. Ignore 0. 1, 1, 2 all divide 1012 → count = 3.
// For 23 → digits are 2, 3. Neither divides 23 evenly → count = 0.
// Essentially, it’s about examining each digit of a number and checking if it’s a factor of the whole number.

package hacker_rank;

import java.util.*;

public class hacker32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int val=n;
            int count=0;

            while(val!=0){
                int d=val%10;
                if(d!=0 && n%d==0){
                    count++;
                }
                val=val/10;
            }
            System.out.println(count);
        }
        
    }
}


// Output:

// 2 -> t

// 544
// 2
// 2010
// 2