// Bon Appétit

// Anna and Brian share a meal with n items, where each item’s cost is given in an array.
// Anna doesn’t eat the item at index k. Brian splits the total bill evenly and charges Anna b.

// Determine whether Brian charged Anna correctly:
// If he overcharged, print the extra amount.
// Otherwise, print "Bon Appetit".

// Input Format

// n k  
// cost[0] cost[1] ... cost[n-1]  
// b

package hacker_rank;

import java.util.*;

public class hacker18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];

        int suma=0;
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            suma=suma+arr[i];
        }
        suma=suma-arr[k];
        suma=suma/2;
        
        int b=sc.nextInt();
        
        if(b>suma){
            int diff=b-suma;
            System.out.println(diff);
        }
        else{
            System.out.println("Bon Appetit");
        }
    }
}



// Input:
// 4 1
// 3 10 2 9
// 12

// Output:
// 5