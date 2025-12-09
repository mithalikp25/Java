package AlgoForge;

import java.util.*;

public class ternary {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your age:");
    int age = sc.nextInt();
  String result = (age>= 18) ? "You are eligible to vote." : "You are not eligible to vote.";
    System.out.println(result);
    sc.close();
  }
}

// Output:

// Enter your age:20
// You are eligible to vote.

// Enter your age:17
// You are not eligible to vote.
