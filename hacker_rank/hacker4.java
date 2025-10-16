// Given an array of integers, calculate the ratios of its elements that are positive,negative and zero
// Print the decimal value of each fraction on a new line with 6 places after the decimal.

// Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

// Example
//[-4, 3, -9, 0, 4, 1]
// There are  elements, two positive, three negative and one zero. 
//The ratios of their values are 2/6, 3/6 and 1/6. Results are printed as:
// 0.333333
// 0.500000
// 0.166667

package hacker_rank;

import java.util.Scanner;

public class hacker4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        double pos=0;
        double neg=0;
        double zer=0;
        for (int i = 0; i < arr.length; i++){
                arr[i] = in.nextInt();
            }

            for (int i = 0; i < arr.length; i++){
                if(arr[i]>0){
                  pos++;  
                }
                else if(arr[i]<0){
                   neg++;  
                }
                else if(arr[i]==0){
                  zer++;
                }
            }
    
        System.out.printf("%.6f\n", pos / n);
        System.out.printf("%.6f\n", neg / n);
        System.out.printf("%.6f\n", zer / n);

    }
}

// output:
// 6
// 1
// 2
// 0
// 0
// -5 
// -4
// 0.333333
// 0.333333
// 0.333333
