//Extra Long Factorials

// You are given an integer n. Your task is to calculate and print the factorial of n (n!), 
// which is the product of all positive integers from 1 to n.

// Since the factorial grows very quickly, 
// for large n the result can be much bigger than the normal integer or long types can store. 
// You need to use a data type or structure that can handle arbitrarily large numbers.

package hacker_rank;

import java.math.BigInteger;
import java.util.Scanner;

public class hacker35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger res= BigInteger.ONE;

        for(int i=n;i>=1;i--){
            res=res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res);
    }
}


// Output:

// 25
// 15511210043330985984000000

// 30
// 265252859812191058636308480000000