// A professor wants to cancel class if fewer than 'k' students arrive on time.
// Each student's arrival time is given as an integer:
// - Arrival time <= 0 → on time
// - Arrival time > 0  → late

// If the number of students on time is less than 'k',
// the class is cancelled → print "YES"
// Otherwise, print "NO".
// 📥 Input Format:
// t                   → number of test cases
// n k                 → number of students, threshold
// a1 a2 ... an        → arrival times of each student
// (repeat for each test case)

// 🧠 Example Input:
// 2
// 4 3
// -1 -3 4 2
// 5 2
// 0 -1 2 1 4
// 💬 Example Output:
// YES
// NO

// Explanation:
// Test 1 → On-time students = 2 (<3) → class cancelled → YES
// Test 2 → On-time students = 2 (>=2) → class not cancelled → NO


package hacker_rank;

import java.io.*;
import java.util.*;

public class hacker10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int count=0;

            for(int j=0;j<n;j++){
                int arrival=sc.nextInt();
                if(arrival<=0){
                    count++;
                }
            }

            if(count>=k){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
