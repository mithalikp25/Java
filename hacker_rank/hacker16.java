// Angry Professor 

// A professor cancels class if fewer than k students arrive on time (time <= 0).

// Input:
// t → number of test cases
// For each test case:
// n k → number of students and threshold
// n space-separated integers → arrival times (<=0 = on time, >0 = late)

// Output:
// For each test case, print:
// "YES" → class cancelled
// "NO" → class goes on

package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hacker16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        for (int test = 0; test < t; test++) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            int count = 0;

            for (int i = 0; i < n; i++) {
                int time = sc.nextInt();
                if (time <= 0){
                 count++;
                }  
            }
            
            if (count < k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

// Output:
// 1
// 5 3
// -1 -3 4 2 0

// NO
