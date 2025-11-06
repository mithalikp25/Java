//Check if a number is a palindrome. 

package logic_building;

import java.util.*;

public class num_based4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=sc.nextInt();
        int rev=0;
        int ori=a;

        for(int i=0;i<=a;i++){
            while(a!=0)
            {int rem=a%10;
            rev=rev*10+rem;
            a=a/10;}
        }
        System.out.println("reverse of digits is: " + rev);

        if(rev==ori){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}

// output:

// enter a number: 1221
// reverse of digits is: 1221
// The number is a palindrome

// enter a number: 132
// reverse of digits is: 231
// The number is not a palindrome