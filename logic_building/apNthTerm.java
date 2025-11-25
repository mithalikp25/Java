package logic_building;

import java.util.*;

public class apNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter term number to find (n): ");
        int n = sc.nextInt();

        int nthTerm = a + (n - 1) * d;
        System.out.println("The " + n + "th term of the AP series is: " + nthTerm);
    }
}


// output


//ap:2, 5, 8, 11, 14

// Enter first term (a): 2
// Enter common difference (d): 3
// Enter term number to find (n): 4
// The 4th term of the AP series is: 11