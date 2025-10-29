//Electronics Shop

// You’re given:
// An integer b — your total budget.
// Two arrays:
// keyboards[] — prices of keyboard models.
// drives[] — prices of USB drives.

// You must buy one keyboard and one drive without exceeding the budget.
// Find the maximum amount you can spend.
// If you can’t buy both, print -1.

package hacker_rank;

import java.util.*;

public class hacker26 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int b=sc.nextInt();
    int n=sc.nextInt();
    int m=sc.nextInt();
    int keyboards[]=new int[n];
    int drives[]=new int[m];
    int max=-1;
    
    for(int i=0;i<n;i++){
        keyboards[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
        drives[i]=sc.nextInt();
    }
    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           int sum=keyboards[i]+drives[j];
            if(sum<=b){
             max=Math.max(sum,max);   
            }
        }
    }
    System.out.print(max);
 }
}

output:
// 10 2 3
// 3 1
// 5 2 8

// 9