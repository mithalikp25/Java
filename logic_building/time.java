// Check AM or PM (24-hour format)

package logic_building;

import java.util.*;

public class time {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter time in 24hr format:");
    int x=sc.nextInt();

    if(x>=0&&x<12){
        System.out.println(x+" AM");
    }
    else if(x>12&&x<24){
        System.out.println((x-12)+" PM");
    }
    else if(x==12){
        System.out.println("12 PM");
    }
    else if(x == 0 || x == 24){
        System.out.println("12 AM");
    }
    else{
        System.out.println("invalid time");
    }
    }
}

// output

// enter time in 24hr format:20
// 8 PM

// enter time in 24hr format:9
// 9 AM

// enter time in 24hr format:24
// 12 AM