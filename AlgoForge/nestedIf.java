package AlgoForge;

import java.util.*;

public class nestedIf {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your age:");
    int age=sc.nextInt();
    System.out.print("enter citizenship status(true/false):");
    boolean isCitizen=sc.nextBoolean();

    if(age>=18){
      System.out.print("eligible to vote");
      if(isCitizen){
        System.out.println(" and a citizen");
      }
      else{
        System.out.println(" but not a citizen");
      }
    }
    else{
      System.out.println("not eligible to vote");
    }
    sc.close();
  }
}

// Output:

// Enter your age:20
// enter citizenship status(true/false):true
// eligible to vote and a citizen

// Enter your age:55
// enter citizenship status(true/false):false
// eligible to vote but not a citizen