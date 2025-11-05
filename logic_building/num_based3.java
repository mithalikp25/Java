// Check if a number is prime or not. 

package logic_building;

import java.util.*;

public class num_based3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int count = 0;

        for (int j = 1; j <= a; j++) {
            if (a % j == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }
}

// output:
// Enter a number:
// 2
// 2 is a prime number

// Enter a number:
// 10
// 10 is not a prime number