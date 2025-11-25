//Libary Fine

// A library charges a fine for returning a book late.

// You are given:
// Return date: d1 m1 y1
// Due date: d2 m2 y2

// Fine Rules
// Calculate the fine as:
//If the book is returned on or before the due date
// → Fine = 0
//If returned late but in the same month and year
// → Fine = 15 × (number of late days)
//If returned late but in the same year (different month)
// → Fine = 500 × (number of late months)
//If returned in a later year
// → Fine = 10000

// Example 1

// Input
// 9 6 2015   ← returned
// 6 6 2015   ← due


// Returned 3 days late in the same month and year:
// Fine = 15 × 3 = 45

// Output
// 45


package hacker_rank;

import java.util.*;

public class hacker38 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //return date
    int d1=sc.nextInt();
    int m1=sc.nextInt();
    int y1=sc.nextInt();

    //due date
    int d2=sc.nextInt();
    int m2=sc.nextInt();
    int y2=sc.nextInt();

    int fine=0;

    if (y1 > y2) {
        fine = 10000;
    }
    else if (y1 == y2 && m1 > m2) {
        fine = 500 * (m1 - m2);
    }
    else if (y1 == y2 && m1 == m2 && d1 > d2) {
        fine = 15 * (d1 - d2);
    }
    else {
        fine = 0;
    }
        System.out.println(fine);
    }
}

//output:

// 1 1 2016
// 31 12 2015
// 10000