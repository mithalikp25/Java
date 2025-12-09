package AlgoForge;

import java.util.*;

public class leapy {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a year to check if it's a leap year:");
    int year = sc.nextInt();
    String result = leap(year);
    System.out.println(result);
    sc.close();
  }

  public static String leap(int year) {
    String res=(year%4==0 && year%100!=0) || (year%400==0) ? "Leap Year" : "Not a Leap Year";
    return res;
  }
}


// Output:

// Enter a year to check if it's a leap year:2000
// Leap Year

// Enter a year to check if it's a leap year:2027
// Not a Leap Year