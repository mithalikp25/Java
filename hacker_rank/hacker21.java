// 🐾 Cats and a Mouse

// Two cats (Cat A and Cat B) and a mouse (Mouse C) are at distinct positions on a straight line.
// You are given the positions of the cats and the mouse.
// The cats move 1 unit per turn toward the mouse.
// Determine which cat will reach the mouse first, or if the mouse escapes.

// Function Description
// Complete the function catAndMouse(x, y, z) where:
// x → position of Cat A
// y → position of Cat B
// z → position of Mouse C

// Return:
// "Cat A" if Cat A reaches first
// "Cat B" if Cat B reaches first
// "Mouse C" if both cats reach at the same time

package hacker_rank;

import java.util.*;

public class hacker21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();

        for(int i=0;i<q;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int sum1=Math.abs(a-c);
        int sum2=Math.abs(b-c);

        if(sum1>sum2){
            System.out.println("Cat B");
        }
        else if (sum2>sum1) {
            System.out.println("Cat A");
        } else {
            System.out.println("Mouse C");
        }
        }
    }
}

// Input
// 2
// 1 2 3
// 1 3 2

// Output
// Cat B
// Mouse C
