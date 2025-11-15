// Sequence Equation

// You are given a sequence of distinct integers p[1..n] where each element is from 1 to n.

// For each x = 1..n, find an integer y such that:
// 𝑝[𝑝[𝑦]]= 𝑥

// Return the values of y for all x in an array.

package hacker_rank;

import java.util.*;

public class hacker31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=1;i<=n;i++){
            int val = sc.nextInt();
            map.put(val,i);
        }

        for(int i=1;i<=n;i++){
            int x=map.get(i);
            int y=map.get(x);
            System.out.println(y);
        }  
}
}


// output:

// 3
// 2 3 1

// 2
// 3
// 1