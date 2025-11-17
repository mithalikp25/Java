//Print the sum of all factors of a given number.

package logic_building;

import java.util.*;

public class math5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to find factors of:");
        int n=sc.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("sum of factors:"+sum);
    }
}


// Output:

// enter the number to find factors of:10
// 1
// 2
// 5
// 10
// sum of factors:18
