// // HackerRank Problem: Breaking the Records
//                                      Count
//     Game  Score  Minimum  Maximum   Min Max
//      0      12     12       12       0   0
//      1      24     12       24       0   1
//      2      10     10       24       1   1
//      3      24     10       24       1   1

package hacker_rank;

import java.util.*;

public class hacker12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int mini_count = 0;
        int maxi_count = 0;

        int mini = arr[0];
        int maxi = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
                maxi_count++;
            }
            if (arr[i] < mini) {
                mini = arr[i];
                mini_count++;
            }
        }

        System.out.println(maxi_count + " " + mini_count);
    }
}

// output:
// 10
// 3 4 21 36 10 28 35 5 24 42
// 4 0