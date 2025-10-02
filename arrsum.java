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
        System.out.println("the array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
        }
        System.out.print("the sum is"+ sum);
    }
}
