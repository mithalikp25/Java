// % (modulus) gives remainder.
// If a % b == 0, then a is divisible by b (i.e., multiple of b).
// If b % a == 0, then b is divisible by a.
// If either is true → one is a multiple of the other.

package logic_building;

import java.util.*;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        if (a % b == 0 || b % a == 0)
            System.out.println("One number is a multiple of the other");
        else
            System.out.println("Not multiples");
    }
}

// output

// Enter two numbers: 4 2
// One number is a multiple of the other