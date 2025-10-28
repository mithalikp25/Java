//Counting Valleys
// Given:
// - An integer n (number of steps)
// - A string path of n characters ('U' = up, 'D' = down)

// A valley is a sequence of steps below sea level, starting with a 'D' from level 0 
// and ending when the hiker returns to sea level.

// Write a program to count and print the number of valleys.

package hacker_rank;

import java.util.*;

public class hacker23 {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      String seq=in.next();
      
      int level=0;
      int count=0;

      for(int i=0;i<n;i++){
        if(seq.charAt(i)=='U'){
            count++;
        }
        else if(seq.charAt(i)=='D'){
            if(count==0){
                level++;
            }
            count--;
        }
      }
      System.out.println(level);
    }
}


// output:
// 12
// DDUUDDUDUUUD
// 2

