// Cut the Sticks

// You are given an array of integers representing the lengths of sticks.
// Each iteration, you must:
// 1)Find the shortest stick length.
// 2)Cut that length from each stick that is still positive.
// 3)Discard any sticks that are reduced to zero.
// 4)Print the number of sticks that remain before each cut operation — until no sticks are left.

// | Step | Stick Lengths (before cut) | Shortest | Cut Result  | Remaining Sticks |
// | ---- | -------------------------- | -------- | ----------- | ---------------- |
// | 1    | 5 4 4 2 2 8                | 2        | 3 2 2 0 0 6 | 6                |
// | 2    | 3 2 2 6                    | 2        | 1 0 0 4     | 4                |
// | 3    | 1 4                        | 1        | 0 3         | 2                |
// | 4    | 3                          | 3        | 0           | 1                |

package hacker_rank;

import java.util.*;

public class hacker30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int count=0;
        int total=n;
        int min=arr[0];

        System.out.println(total);

        for(int i=0;i<n;i++){
            if(arr[i]==min){
                count++;
            }
            else{
                total-=count;
                min=arr[i];
                count=1;
                System.out.println(total);
            }
        }
        
    }
}


// output:
// 6
// 5 4 4 2 2 8   

// 6
// 4
// 2
// 1