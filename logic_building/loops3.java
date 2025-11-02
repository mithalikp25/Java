//sum of all odd numbers up to n. 

package logic_building;

import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of all odd numbers up to " + n + " is: " + sum);
    }
}

// output:
// enter a number
// 10
// Sum of all odd numbers up to 10 is: 25