//check whether a number is a whole number

package logic_building;

import java.util.*;

public class WholeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if (num >= 0 && num % 1 == 0)
            System.out.println(num + " is a whole number.");
        else
            System.out.println(num + " is not a whole number.");
    }
}

// output:
// Enter a number: 4.5
// 4.5 is not a whole number.

// Enter a number: 5
// 5.0 is a whole number.