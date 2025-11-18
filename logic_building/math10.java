//find LCM of two numbers using HCF

// LCM of 12 and 18

// Multiples of 12: 12, 24, 36, 48, 60, 72...
// Multiples of 18: 18, 36, 54, 72...
// LCM = 36

package logic_building;

import java.util.*;

public class math10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int n=sc.nextInt();
        System.out.print("enter second number:");
        int m=sc.nextInt();

        int hcf=0;

        for(int i=Math.min(n,m);i>=1;i--){  // Start from the minimum of n and m
            if(n%i==0 && m%i==0){
                hcf=i;
                break;  // Exit loop once HCF is found
            }
        }
       int lcm=(n*m)/hcf;  // Calculate LCM using the relationship between HCF and LCM
       System.out.print("LCM is:"+lcm);
    }
}

// Output:

// enter first number:8
// enter second number:24
// LCM is:24