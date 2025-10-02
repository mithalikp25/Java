import java.util.*;
import java.io.*;

class arrsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("the array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
        }
        System.out.println("the sum is:"+ sum);
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
// the array elements are:1 2 3 4 5 the sum is:15