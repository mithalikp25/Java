// Drawing Book

// A book has n pages, numbered from 1 to n.
// You can turn pages from the front or the back.
// Each turn flips 2 pages (like a real book).

// Given a page number p, determine the minimum number of page turns needed to reach page p.

// Function Description
// Complete the function pageCount(n, p) where:
// n → total number of pages
// p → target page number

package hacker_rank;

import java.util.*;

public class hacker20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();

        int total=n/2;
        int front=p/2;
        int back=total-front;

        int ans=Math.min(front, back);
        System.out.println(ans);
    }
}

// Input:
// 6
// 2

// Output:
// 1
