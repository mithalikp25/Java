//Check if a point lies on X-axis, Y-axis, or Origin

package logic_building;

import java.util.*;

public class PointCheck {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter x,y co-ordinates");
    int x=sc.nextInt(),y=sc.nextInt();

    if(x==0 && y==0){
        System.out.println("point is at origin");
    }
    else if(x==0){
        System.out.println("point is on y-axis");
    }
    else if(y==0){
        System.out.println("point is on x-axis");
    }
    else{
        System.out.println("point is in quadrant");
    }
}
}


// output:
// enter x,y co-ordinates
// 0 0
// point is at origin

// enter x,y co-ordinates
// 2 5
// point is in quadrant

// enter x,y co-ordinates
// 0 4
// point is on y-axis
