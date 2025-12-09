package AlgoForge;

import java.util.*;

public class days {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number (1-7) to get the corresponding day of the week:");
    int dayNum = sc.nextInt();
    System.out.print("the day is:"+dayWeek(dayNum));
    sc.close(); 
  }

  public static String dayWeek(int day){
    String dayName = switch (day) {
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6 -> "Saturday";
      case 7 -> "Sunday";
      default -> "Invalid day number";
    };
    return dayName;
  }
}


// Output:

// Enter a number (1-7) to get the corresponding day of the week:7
// the day is:Sunday

// Enter a number (1-7) to get the corresponding day of the week:2
// the day is:Tuesday