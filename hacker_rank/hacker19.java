// 🧾 Sales by Match

// You have a pile of socks with different colors represented as integers in an array.
// Each sock color can form a pair with another sock of the same color.
// Determine the total number of matching pairs of socks you can sell.

// Function Description
// Complete the function sockMerchant(n, ar) where:
// n → the number of socks
// ar → array of integers representing sock colors

package hacker_rank;

import java.util.*;

public class hacker19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }

        int pair=0;
        for(Integer key:mp.keySet()){
            int value=mp.get(key);
            pair=pair+(value/2);
        }
        System.out.println(pair);
    }
}

// Input:
// 9
// 10 20 20 10 10 30 50 10 20

// Output:
// 3