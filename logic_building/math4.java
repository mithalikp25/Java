//Print all factors of a given number.

package logic_building;

import java.util.*;

public class math4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to find factors of:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}

// Output:

// enter the number to find factors of:10
// 1
// 2
// 5
// 10