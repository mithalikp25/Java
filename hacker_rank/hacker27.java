// Beautiful Days at the Movies

// A day number is considered beautiful if the absolute difference between the day and its reversed number is perfectly divisible by k.
// Find how many beautiful days lie between i and j (inclusive).

package hacker_rank;

import java.util.Scanner;

public class hacker27 {
     public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int i=sc.nextInt();
      int j=sc.nextInt();
      int k=sc.nextInt();
      int count=0;

    for(int a=i;a<=j;a++){
        int val=a;
        int rev=0;
        while(val!=0){
            int rem=val%10;
            rev=rev*10+rem;
            val=val/10;
        }
        int num=Math.abs(a-rev);
        double div= (double) num/k;
        
        if((div>=0)&&(div%1==0)){
            count++;
        }
    }
    System.out.println(count);
    }
}

// output:
// 20 23 6
// 2