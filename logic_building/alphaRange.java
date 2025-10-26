// Check alphabet range (a–m or n–z)

package logic_building;

import java.util.*;

public class alphaRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        ch=Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'm')
            System.out.println("Alphabet lies between 'a' and 'm'");
        else if (ch >= 'n' && ch <= 'z')
            System.out.println("Alphabet lies between 'n' and 'z'");
        else
            System.out.println("Not a lowercase alphabet");
    }
}

// output

// Enter a character: h
// Alphabet lies between 'a' and 'm'