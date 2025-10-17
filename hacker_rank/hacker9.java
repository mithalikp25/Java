// 🧩 Problem: Apple and Orange

// Description:
// Sam’s house lies between points s and t on a number line.
// An apple tree is at point a, and an orange tree is at point b.
// Each fruit falls a certain distance from its tree (positive = right, negative = left).

// Determine how many apples and oranges fall on Sam’s house.

// Input Format:
// 1️⃣ s t → Start and end points of Sam’s house
// 2️⃣ a b → Locations of the apple and orange trees
// 3️⃣ m n → Number of apples and oranges
// 4️⃣ Next line → Distances of m apples
// 5️⃣ Next line → Distances of n oranges

// Output Format:

// Number of apples on the house
// Number of oranges on the house

package hacker_rank;

import java.util.*;
import java.text.*;
import java.math.*;
import java.io.*;
import java.util.regex.*;

public class hacker9 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] apples=new int[m];
        int[] oranges=new int[n];
        int count1=0;
        int count2=0;
        
        for(int i=0;i<apples.length;i++){
            apples[i]=sc.nextInt();
            }
        for(int i=0;i<oranges.length;i++){
            oranges[i]=sc.nextInt();
            }

        for(int i=0;i<apples.length;i++){
            int dist=a+apples[i];
            if(dist>=s && dist<=t){
                count1++;
            }
        }
        for(int i=0;i<oranges.length;i++){
            int dist=b+oranges[i];
            if(dist>=s && dist<=t){
                count2++;
            }
        }
        
        System.out.println(count1);
        System.out.println(count2);
    }
}

// output:
// Sample Input:

// 7 11
// 5 15
// 3 2
// -2 2 1
// 5 -6


// Sample Output:

// 1
// 1