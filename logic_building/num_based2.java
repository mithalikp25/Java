//Count the number of digits in a given number. 

package logic_building;

import java.util.*;

public class num_based2  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int count=0;

           while(a!=0)
           { int rem=a%10;
            count++;
            a=a/10;}
        
        System.out.println("count of digits is: " + count);
    }
}


// output:

// enter a number
// 234543
// count of digits is: 6
