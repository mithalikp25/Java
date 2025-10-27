//Take coordinates (x, y) and determine which quadrant the point lies in.

package logic_building;

import java.util.*;

public class QuadrantFinder {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter x coordinate");
    int x=sc.nextInt();
    System.out.println("enter y coordinate");
    int y=sc.nextInt();
    
    if(x>0&&y>0){
        System.out.println("1st quadrant");
    }
    else if (x<0&&y<0) {
        System.out.println("3rd quadrant");
    }
    else if (x<0&&y>0) {
        System.out.println("4th quadrant");
    }
    else if (x>0&&y<0) {
        System.out.println("2nd quadrant");
    }
    else{
        System.out.println("invalid quadrant");
    }
     }
}

//output
// enter x coordinate
// 5
// enter y coordinate
// 4
// 1st quadrant

// enter x coordinate
// -9
// enter y coordinate
// 9
// 4th quadrant
