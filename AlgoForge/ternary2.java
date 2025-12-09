package AlgoForge;

import java.util.*;

public class ternary2 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your marks:");
    int marks = sc.nextInt();

    String grade = (marks>=90)?"A":
                    (marks>=80)?"B":
                    (marks>=70)?"C":
                    (marks>=60)?"D":
                    (marks>=50)?"E":"F";

  System.out.println("Your grade is: " + grade);
    sc.close();
  }
}


//this is a nested ternary operator 
//(condition1) ? result1
            //  : (condition2) ? result2
            //                  : result3;

// Output:

// Enter your marks:95
// Your grade is: A

// Enter your marks:56
// Your grade is: E