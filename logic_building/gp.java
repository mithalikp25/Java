// Geometric Progression (GP) Series in Java

/*
Geometric Progression (GP)

→ A sequence of numbers where each term is obtained 
  by multiplying the previous term by the same constant value.

→ This constant value is called the Common Ratio (r).

Example:
3, 6, 12, 24, 48...
Here, r = 6 / 3 = 2

To print GP in Java:
   - Start from first term 'a'
   - Keep multiplying by 'r' to get next term
   - Repeat for 'n' terms

Example logic:
a = a * r;   // moves to next term
*/


package logic_building;

import java.util.*;

public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.print("GP Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a * r;
        }
    }
}


// output

// Enter first term (a): 3
// Enter common ratio (r): 2
// Enter number of terms (n): 5
// GP Series: 3 6 12 24 48 