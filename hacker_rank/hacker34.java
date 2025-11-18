//Closest Numbers

// You are given an array of integers.
// Find all pairs of elements with the smallest absolute difference.

// Input: first line → n (size of array), second line → n integers.
// Output: print all pairs with the minimum difference in ascending order, each pair as a b.

package hacker_rank;

import java.util.*;

public class hacker34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();           // Step 1: Read number of elements
        ArrayList<Integer> arr = new ArrayList<>();

        // Step 2: Read the elements
        for (int i = 0; i < n; i++) {
            int val=in.nextInt();
            arr.add(val);
        }

        // Step 3: Sort the array
        Collections.sort(arr);

        // Step 4: Find the minimum difference between consecutive numbers
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int diff = arr.get(i + 1) - arr.get(i); // difference between consecutive numbers
            min_diff = Math.min(diff, min_diff);
        }

        // Step 5: Collect all pairs with the minimum difference
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int diff = arr.get(i + 1) - arr.get(i);
            if (diff == min_diff) {
                ans.add(arr.get(i));     // first number of the pair
                ans.add(arr.get(i + 1)); // second number of the pair
            }
        }

        // Step 6: Print all pairs
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}


// Output:

// 4
// 5 4 3 2
// 2 3 3 4 4 5

// 6
// 4 2 1 3 5 7
// 1 2 2 3 3 4 4 5 