// HackerLand University has the following grading policy:

// Every student receives a grade in the inclusive range from 0 to 100 .
// Any grade less than 40 is a failing grade.
// Sam is a professor at the university and likes to round each student's grade according to these rules:

// If the difference between the grade and the next multiple of 5 is less than 3, 
// round grade up to the next multiple of 5 .
// If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
// Examples

// 84: round to  (85 - 84 is less than 3)
// 29: do not round (result is less than 38)
// 57: do not round (60 - 57 is 3 or higher)

package hacker_rank;

import java.util.*;

public class hacker8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++){
            int grade = arr[i];
            
            if (grade >= 38) {
                int mul = (grade + 5) - (grade % 5);
                int diff = mul - grade;
                
                if (diff < 3)
                    System.out.println(mul);
                else
                    System.out.println(grade);
            } 
            
            else {
                System.out.println(grade);
            }
        }
    }
}

// output:
// 5 ->size of array
// 12 44 68 98 54 ->elements of array
// 12
// 45
// 70
// 100
// 55