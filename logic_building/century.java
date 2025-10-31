//Take a year and print the corresponding century (e.g., “19th century”, “20th century”) 

package logic_building;

import java.util.*;

public class century {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        int century = (year + 99) / 100 ;
        System.out.println(year + " belongs to the " + century + "th century");
    }
}

//logic:
// (year + 99) / 100
// Adding 99 ensures that any year not exactly divisible by 100 gets rounded up to the next century.
// Example:
// Year = 1901 → (1901 + 99) / 100 => 2000 / 100 => 20
// Year = 1900 → (1900 + 99) / 100 => 1999 / 100 => 19

// output:
// Enter a year: 24
// 24 belongs to the 1th century

// Enter a year: 1998
// 1998 belongs to the 20th century
