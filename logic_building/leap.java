//program to check whether a year is leap year or not

package logic_building;

import java.util.*;

public class leap {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

// output

// Enter year: 2014
// 2014 is not a leap year

// Enter year: 2024
// 2024 is a leap year