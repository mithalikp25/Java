//Find the Median of Three Numbers

package logic_building;

import java.util.*;

public class median {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter three numbers");
    int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();

    if((b>a&&b<c)||(b<a&&b>c)){
        System.out.println("the median of three numbers is "+b);
    }
    else if((a>b&&a<c)||(a<b&&a>c)){
        System.out.println("the median of three numbers is "+a);
    }
    else{
        System.out.println("the median of three numbers is "+c);
    }
    
    }
}

// output:
// enter three numbers
// 1 3 6
// the median of three numbers is 3