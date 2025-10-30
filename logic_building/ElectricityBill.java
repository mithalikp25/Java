//Electricity Bill Calculation
// 1st 100 units: ₹1 per unit
// Next 100 units: ₹2 per unit  
// Beyond 200 units: ₹3 per unit

package logic_building;

import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.0; 
        } 
        else if (units <= 200) {
            bill = (100 * 1.0) + (units - 100) * 2.0; 
        } 
        else {
            bill = (100 * 1.0) + (100 * 2.0) + (units - 200) * 3.0; 
        }

        System.out.println("Total electricity bill:" + bill+"rs");
    }
}

// output:
// Enter units consumed: 250
// Total electricity bill:450.0rs