package logic_building;

import java.util.*;

public class gpNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter term number to find (n): ");
        int n = sc.nextInt();

        int nthTerm = (int)(a * Math.pow(r, n - 1));
        System.out.println("The " + n + "th term of the GP series is: " + nthTerm);
    }
}


// output

//gp:3, 6, 12, 24, 48

// Enter first term (a): 3
// Enter common ratio (r): 2
// Enter term number to find (n): 5
// The 5th term of the GP series is: 48