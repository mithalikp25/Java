//Check whether a number is a perfect square (without using the square root function).

package logic_building;

import java.util.*;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPerfect = false;
        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n) {
                isPerfect = true;
                break;
            }
        }

        if (isPerfect)
            System.out.println("Perfect square.");
        else
            System.out.println("Not a perfect square.");

    }
}

// output

// Enter a number: 25
// Perfect square.

// Enter a number: 10
// Not a perfect square.
 

//🧠 Logic Explanation:

// You take the number n.
// Loop i from 1 to n/2.
// Because no number greater than n/2 can have its square ≤ n.
// For every number i, check if i × i == n.
// If yes → n is a perfect square.

// Otherwise, after the loop ends, it’s not a perfect square.