import java.util.*;
import java.io.*;

class arrmul {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int product=1;
        System.out.println("enter the elements:");
        int arr1[]=new int[size];

        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.print("the array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
            product=product*arr1[i];
        }
        System.out.println("the product is:"+ product);
    }
}

// output:

// Enter the size of the array:5
// enter the elements:
// 1
// 2
// 3 
// 4
// 5
// the array is:1 2 3 4 5 the product is:120