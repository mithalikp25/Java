// Utopian Tree

// A tree grows in cycles each year:
// Spring: height doubles
// Summer: height increases by 1

// The tree starts with height = 1. Given n growth cycles, determine the height of the tree after all cycles.

// Input:
// First line: integer t → number of test cases
// For each test case:
// One line: integer n → number of cycles

package hacker_rank;

import java.util.*;

public class hacker17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for (int test = 0; test < t; test++) {
            int n = sc.nextInt(); // number of cycles
            int height = 1;

            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) { // Spring
                    height *= 2;
                } else {          // Summer
                    height += 1;
                }
            }

            System.out.println(height); // print height after all cycles
        }
    }
}


// Input:
// 2
// 0
// 1

// Output:
// 1
// 2