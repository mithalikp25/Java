// Migratory Birds 

// Given an array of bird sightings where each element is a bird type id (1–5), return the id of the most frequently sighted type. If there’s a tie, return the smallest id.

// Input:
// First line: integer n (number of birds)
// Second line: n space-separated integers (bird type ids)

// Output:
// Single integer: most frequent bird type id (smallest if tie)

package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hacker15 {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];

      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      HashMap<Integer,Integer> mp=new HashMap<>();

      for(int i=0;i<n;i++){
        int num=arr[i];
        if(mp.containsKey(num)){
            mp.put(num,mp.get(num)+1);
        }
        else{
            mp.put(num,1);
        }
      }
      int ans=0;
      int max=0;
      for(Integer key:mp.keySet()){
            int value=mp.get(key);
            if(value>max){
                max=value;
                ans=key;
            }
      }
System.out.println(ans);
    }
}

// Output:
// 5 -> array size
// 1 3 3 3 2 ->array elements
// 3 -> id of the bird type with highest frequency