package logic_building;

import java.util.*;

public class charAdded {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase letter");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}

// output:
// Enter a character: D
// Uppercase letter