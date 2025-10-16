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
