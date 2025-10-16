// You are in charge of the cake for a child's birthday. 
// It will have one candle for each year of their total age. 
// They will only be able to blow out the tallest of the candles. 
// Your task is to count how many candles are the tallest.

// Sample input
// 4
// 3 2 1 3
// Sample Output 
// 2
// The tallest candles are 4 units high. There are 2 candles with this height, so the function should return 2.

package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hacker6 {
    public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      System.out.print("enter the no.of candles:");
      int n= sc.nextInt();
      int [] arr=new int[n];
      int max=0;
      int count=0;
      for(int i = 0 ;i<n;i++){
          arr[i] = sc.nextInt();
      }
      for(int i = 0 ;i<n;i++){
          max=Math.max(max,arr[i]);
      }
      for(int i = 0 ;i<n;i++){
        if(arr[i]==max){
            count++;
        }
         
      }
System.out.println("the tallest candle count is:"+count);
      }
    }

// output:
// enter the no.of candles:5
// 1
// 1
// 2
// 2
// 2
// the tallest candle count is:3