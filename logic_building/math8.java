//get HCF of two numbers
// HCF (Highest Common Factor)
// The largest number that divides two or more numbers without leaving a remainder.
// Example: HCF of 20 and 30
// Factors:
// 20 → 1, 2, 4, 5, 10, 20
// 30 → 1, 2, 3, 5, 6, 10, 15, 30
// Common factors → 1, 2, 5, 10
// So, HCF = 10

package logic_building;

import java.util.*;
public class math8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int n=sc.nextInt();
        System.out.print("enter second number:");
        int m=sc.nextInt();

        int hcf=0;

        for(int i=1;i<=n;i++){  // Should be i<=n or better i<=Math.min(n,m)
            if(n%i==0 && m%i==0){
                hcf=i;
            }
        }
        System.out.print("HCF is:"+hcf);
    }
}

// Output:

// enter first number:75
// enter second number:90
// HCF is:15