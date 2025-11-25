//program to print AP series

/*
Arithmetic Progression (AP)

→ A sequence of numbers where each term is obtained 
  by adding the same constant value to the previous term.

→ This constant value is called the Common Difference (d).

Example:
2, 5, 8, 11, 14...
Here, d = 5 - 2 = 3

To print AP in Java:
   - Start from first term 'a'
   - Keep adding 'd' to get next term
   - Repeat for 'n' terms
*/


package logic_building;

import java.util.*;

public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.print("AP Series: ");
        for (int i = 1; i < n; i++) {
            System.out.print(a + " ");
            a=  a + d;
        }
    }
}


// output

// Enter first term (a): 2
// Enter common difference (d): 3
// Enter number of terms (n): 14
// AP Series: 2 5 8 11 14 17 20 23 26 29 32 35 38 