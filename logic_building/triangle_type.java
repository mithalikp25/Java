// Determine triangle type (equilateral, isosceles, scalene)

package logic_building;

import java.util.*;

public class triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the three sides of the triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if((a+b>c)&&(b+c>a)&&(a+c>b)){
            if(a==b&&b==c){
                System.out.println("equilateral triangle");
            }
            else if(a==b||b==c||c==a){
                System.out.println("isosceles triangle");
            }
            else{
                System.out.println("scalene triangle");
            }
        }
    }
}

// output

// enter the three sides of the triangle
// 1 1 1 
// equilateral triangle

// enter the three sides of the triangle
// 3 4 5
// scalene triangle