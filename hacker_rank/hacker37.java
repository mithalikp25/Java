//SHerlock and squares

// You are given two integers A and B representing a range (inclusive).
// A perfect square is a number that can be written as k*k, where k is an integer.
// Find how many perfect squares lie between A and B.

// Example:
// A = 3, B = 16
// Perfect squares in this range: 4, 9, 16
// Answer = 3

// A = 3
// B = 9
// We want to check numbers between 3 and 9, like:
// 3, 4, 5, 6, 7, 8, 9

// And find which of them are perfect squares:

// 4 → 2×2  
// 9 → 3×3
// So answer = 2.


package hacker_rank;

import java.util.*;

public class hacker37 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int q=sc.nextInt();
    
    for(int i=0;i<q;i++){
     int a=sc.nextInt();
        int b=sc.nextInt();

        int a1= (int) Math.ceil(Math.sqrt(a));
        int b1= (int) Math.floor(Math.sqrt(b));
        
        int c=b1-a1+1;
        System.out.println(c);   
    }
    }
}


//output:

// 2=>iterations

// 3 9   sqrt 3=1.99 and sqrt 9=3  thus ceil(1.73)=2 and floor(3)=3  thus 3-2+1=2
// 2

// 17 24
// 0