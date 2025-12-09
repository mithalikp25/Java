package AlgoForge;

import java.util.*;

public class conditionals {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter if its raining(true/false):");
    boolean rain=sc.nextBoolean();

    if(rain){
        System.out.println("Take an umbrella");
    }
    else{
        System.out.println("No need to take an umbrella");
    }
    sc.close();
  }
}


// Output:

// Enter if its raining(true/false):true
// Take an umbrella

// Enter if its raining(true/false):false
// No need to take an umbrella