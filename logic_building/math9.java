//find HCF of two numbers(efficient way)


// Direction              Iterations                      Why
// Forward (1→n)          Always checks ALL numbers       Finds answer but keeps going
// Backward (n→1)         Stops as soon as HCF is found   First match IS the largest

package logic_building;
  
import java.util.*;

public class math9 {
    public static void main(String[] args) {
        {Scanner sc=new Scanner(System.in);
    System.out.print("enter first number:");
    int n=sc.nextInt();
    System.out.print("enter second number:");
    int m=sc.nextInt();

    int hcf=0;
    for(int i=n; i>=1; i--){  
        if(n%i==0 && m%i==0){
            hcf=i;
            break;  // Exit loop as soon as HCF is found
            }
      }
    System.out.print("HCF is:"+hcf);}
    }
}

// Output:

// enter first number:75
// enter second number:90
// HCF is:15