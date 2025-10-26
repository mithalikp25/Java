// For any triangle to be valid, the sum of any two sides must be greater than the third.
// This is known as the Triangle Inequality Theorem.

package logic_building;

import java.util.Scanner;

public class traingle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the three sides of the triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if((a+b>c)&&(b+c>a)&&(a+c>b)){
                System.out.println("valid triangle");
            }
            else{
                System.out.println("invalid triangle");
            }
        }
    }

// output

// enter the three sides of the triangle
// 3 4 5
// valid triangle
