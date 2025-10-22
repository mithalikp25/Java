// Given an array of integers and an integer k,
// find the number of pairs (i, j) such that:

// i < j, and

// (arr[i] + arr[j]) % k == 0.

package hacker_rank;

import java.util.*;

public class hacker14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();        
        int k=sc.nextInt();    
        
        int[] arr=new int[n];
        int count=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                sum=arr[i]+arr[j];
                if((sum%k)==0){
                count++;
                }
            }
        }
        System.out.println(count);
    }
}

// output:
// 6 3 -> size of array and k 
// 1 3 2 6 1 2 -> array elements
// 5 -> no.of pairs divisible by k