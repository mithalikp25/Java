//if/else-if/else 

public class conditions {
    public static void main(String[] args) {
        int marks = 60;

        if (marks >= 90) {
            System.out.println("Grade: A"); // For marks 90 and above
        } else if (marks >= 75) {
            System.out.println("Grade: B"); // For marks 75 to 89
        } else if (marks >= 50) {
            System.out.println("Grade: C"); // For marks 50 to 74
        } else {
            System.out.println("Fail");     // For marks below 50
        }
    }
}


//ternary operators

public class conditions {
    public static void main(String[] args) {
        int marks = 72;
        String result=(marks>=70)?"distinction":"better luck next time";
        System.out.println(result);
    }
}