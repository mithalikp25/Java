
package logic_building;

import java.util.*;

public class math1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of elements:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println((int) Math.pow(i, 2));
        }
    }
}

// Output:
// enter number of elements:10
// 1
// 4
// 9
// 16
// 25
// 36
// 49
// 64
// 81
// 100
