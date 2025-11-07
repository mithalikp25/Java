//program to find perfect number

//Divisors of 6 → 1, 2, 3
//Sum = 1 + 2 + 3 = 6

package logic_building;

import java.util.*;

public class num_based7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;

        for(int i=1;i<n;i++){
           if(temp%i==0){
            sum+=i;
           }
        }
        if(sum==n){
            System.out.println(n + " is a Perfect number");
        }
        else{
            System.out.println(n + " is not a Perfect number");
        }
    
    } 
}

// output:
// enter a number: 6
// 6 is a Perfect number

// enter a number: 12
// 12 is not a Perfect number