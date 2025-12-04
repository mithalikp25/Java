//get common factors between two numbers
package logic_building;

import java.util.*;
public class math7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int n=sc.nextInt();
        System.out.print("enter second number:");
        int m=sc.nextInt();

        for(int i=1;i<n;i++){
            if(n%i==0 && m%i==0){
                System.out.print(i+" ");
            }
        }
    }
}

// output:  

// enter first number:75
// enter second number:90
// 1 3 5 15 