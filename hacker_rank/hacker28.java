// Beautiful Days at the Movies

// You are given a range of days numbered from i to j, and a number k.
// A day is called beautiful if the absolute difference between the day number and its reverse is divisible by k.
// Your task is to count how many beautiful days are in the range [i, j] (inclusive).

// Input Format
// A single line containing three space-separated integers:
// i j k
// i = starting day number
// j = ending day number
// k = divisor

// Output Format
// Print the number of beautiful days in the range.

package hacker_rank;

import java.util.*;

public class hacker28 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i=sc.nextInt();
    int j=sc.nextInt();
    int k=sc.nextInt();
    int count=0;

    for(int l=i;l<=j;l++){
        int val=l;
        int rev=0;

        while(val!=0){
            int rem=val%10;
            rev=rev*10+rem;
            val=val/10;
        }

        int sum=Math.abs(l-rev);
        double div=(double) sum/k;

        if((div>=0)&&(div%1==0)){
            count++;
    }
}
    System.out.println(count);
    }
}


// output:
// 20 23 6
// 2