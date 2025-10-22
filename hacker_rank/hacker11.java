// Number Line Jumps (Kangaroo)

// Problem:
// Two kangaroos start at positions x1 and x2 and jump v1 and v2 units per jump. Check if they will land at the same position after the same number of jumps.

// Input:
// x1 v1 x2 v2 (all integers)

// Output:
// YES if they meet, NO if not.

// Example 1:
// Input: 0 3 4 2
// Output: YES

// Example 2:
// Input: 0 2 5 3
// Output: NO

package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class hacker11 {
    public static void main (String[] args){
		
      Scanner in = new Scanner(System.in);
      int x1 = in.nextInt();
      int v1 = in.nextInt();
      int x2 = in.nextInt();
      int v2 = in.nextInt();
    
      if((v1>v2)&&(x2-x1)%(v1-v2)==0){
         System.out.println("YES");
      }else{
          System.out.println("NO");
      }
    }
}


// output:
// 0 3 4 2
// YES

