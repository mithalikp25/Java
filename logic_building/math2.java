//Print cubes of numbers from 1 to n. 

package logic_building;

import java.util.*;

public class math2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println((int) Math.pow(i, 3));
        }
    }
}

// Output:
// enter a number:10
// 1
// 8
// 27
// 64
// 125
// 216
// 343
// 512
// 729
// 1000