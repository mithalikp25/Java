package AlgoForge;

import java.util.*;

public class avg {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter three numbers to find their average:");
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    double num3 = sc.nextDouble();
    System.out.print("the average of the entered values is :"+ average(num1, num2, num3));
    sc.close();
  }

public static double average(double a, double b, double c)
{
    return (a + b+c) / 3;
}

}


//Output:

// Enter three numbers to find their average:
// 10
// 20
// 30
// the average of the entered values is :20.0