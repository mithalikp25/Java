//take a character and check whether it is alphabet , digit or special character.

package logic_building;

import java.util.Scanner;

public class type {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a charcter:" );
    char n = sc.next().charAt(0);

     if (Character.isLetter(n)) {
            System.out.println("The given character is a letter.");
        } 
        else if (Character.isDigit(n)) {
            System.out.println("The given character is a digit.");
        } 
        else {
            System.out.println("The given character is a special character.");
        }
    }
}


// output
// Enter a charcter:A
// given character is a alphabet

// Enter a charcter:234
// given character is a digit

// Enter a charcter:~~~
// given character is a special character
