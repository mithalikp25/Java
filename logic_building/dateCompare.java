package logic_building;

import java.util.*;

public class dateCompare {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first date and month: ");
        int m1 = sc.nextInt(),d1=sc.nextInt();
        System.out.print("Enter the second date and month: ");
        int m2 = sc.nextInt(),d2=sc.nextInt();

        if((m1<m2)||(m1==m2)&&(d1<d2)){
            System.out.println("Date1 is earlier than Date2");
        }
        else if((m1>m2)||(m1==m2)&&(d1>d2)){
            System.out.println("Date2 is earlier than Date1");
        }
        else{
            System.out.println("Both dates are the same");
        }

     }
}

// output:
// Enter the first date and month  : 2 10
// Enter the second date and month  : 14 5
// Date1 is earlier than Date2

// Enter the first date and month: 13 4
// Enter the second date and month: 13 4
// Both dates are the same