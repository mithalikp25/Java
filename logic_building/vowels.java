package logic_building;
import java.util.*;

class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  
        System.out.println("You entered: " + ch);

        // convert to lowercase to handle uppercase vowels too
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}

// output:
// Enter a character: r
// You entered: r
// Consonant