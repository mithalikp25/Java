//Check if a number is a multiple of 7 or ends with 7.

package logic_building;

import java.util.*;

public class MultipleOrEndsWith7 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();

    if (n%7==0) {
        System.out.println("number is a multiple of 7");
    } 
    else if(n%10==7){
        System.out.println("number ends with 7");
    }
    else{
        System.out.println("neither");
    }
    }
}

// output
// enter a number
// 14
// number is a multiple of 7

// enter a number
// 17
// number ends with 7

//enter a number
// 5895
// neither