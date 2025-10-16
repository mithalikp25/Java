// Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
// Then print the respective minimum and maximum values as a single line of two space-separated long integers.

// Example
// arr = [1,3,5,7,9]
//1+3+5+7=16
//3+5+7+9=24
// The minimum sum is 16 and the maximum sum is 24. The function prints
// 16 24

package hacker_rank;

import java.util.Scanner;
import java.util.Arrays;

public class hacker5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        long sum=0;
        long max = 0;
        long min = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            max=sum-arr[0];
            min=sum-arr[arr.length-1];
        }
        
        
        System.out.println(min + " " + max);
        sc.close();
    }
}


