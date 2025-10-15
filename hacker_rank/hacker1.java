package hacker_rank;
// Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
// The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).
// The task is to calculate their comparison points by comparing each category:

// If a[i] > b[i], then Alice is awarded 1 point.
// If a[i] < b[i], then Bob is awarded 1 point.
// If a[i] = b[i], then neither person receives a point.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hacker1 {
    public static void main(String args[]) {

      Scanner in = new Scanner(System.in);
      int[] a = new int[3];
      int[] b = new int[3];
      int a_score=0;
      int b_score=0;
      
      for(int i = 0 ;i<3;i++){
          a[i] = in.nextInt();
      }
      
      for(int i = 0 ;i<3;i++){
          b[i] = in.nextInt();
      }
      
    for(int i = 0 ;i<3;i++){
          if(a[i]>b[i]){
            a_score++;
          }
          else if(a[i] < b[i]){
            b_score++;
          }
      }
      System.out.println(a_score+" "+b_score);
      }
    }


// output:
// 1
// 2
// 3
// 4
// 5
// 6
// 0 3