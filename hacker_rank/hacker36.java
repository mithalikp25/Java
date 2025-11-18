//missing numbers
//Given two arrays of integers, find which elements in the second array are missing from the first array.

package hacker_rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class hacker36 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr1.add(in.nextInt());
        }

        int m = in.nextInt();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            arr2.add(in.nextInt());
        }

        Collections.sort(arr1);
        Collections.sort(arr2);

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : arr2) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
 
        for (int num : arr1) {
            if (mp.containsKey(num)) {
                mp.put(num, mp.get(num) - 1);
            }
        }

        for (int key : mp.keySet()) {
            if (mp.get(key) > 0) {
                System.out.print(key + " ");
            }
        }
    }
}

// Output:

// 10
// 203 204 205 206 207 208 203 204 205 206
// 13
// 203 204 204 205 206 207 205 208 203 206 205 206 204

// 204 205 206 
