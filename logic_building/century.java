//Take a year and print the corresponding century (e.g., “19th century”, “20th century”) 

package logic_building;

import java.util.*;

public class century {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        int century = (year - 1) / 100 + 1;
        System.out.println(year + " belongs to the " + century + "th century");
    }
}

// output:
// Enter a year: 24
// 24 belongs to the 1th century

// Enter a year: 1998
// 1998 belongs to the 20th century
