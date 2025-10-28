// The Hurdle Race

// Dan is playing a video game where he must jump over hurdles. 
// He can jump a maximum height of k. 
// There are n hurdles, each with a certain height.

// Determine the minimum number of magic potions Dan needs to be able 
// to jump all the hurdles.

// Input Format:
// - The first line contains two integers n and k.
// - The second line contains n space-separated integers representing the hurdle heights.

package hacker_rank;

import java.util.Scanner;

public class hacker24 {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int[] arr=new int[n];
        int max=0;
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            max=Math.max(arr[i],max);
        }
        int potion=0;
        if(k>max){
            potion=0;
        }
        else{
            potion=max-k;
        }
        System.out.print(potion);
    }
}

// Output:
// 5 4
// 1 6 3 5 2
// 2