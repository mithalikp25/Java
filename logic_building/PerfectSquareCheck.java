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
 