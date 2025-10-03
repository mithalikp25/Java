import java.util.*;
import java.io.*;

class arrEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int even_sum=0;
        int odd_sum=0;

        int arr[]=new int[size];
        System.out.println("enter the elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("the array is:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        
        System.out.println("the even array elements are:");
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
            System.out.println(arr[i]+" ");
            even_sum=even_sum+arr[i];
            }
        }
        System.out.println("the even_sum is:"+ even_sum);

        System.out.println("the odd array elements are:");
        for(int i=0;i<size;i++){
            if(arr[i]%2!=0){
            System.out.println(arr[i]+" ");
            odd_sum=odd_sum+arr[i];
            }
        }
        System.out.println("the odd_sum is:"+ odd_sum);
        }
        
    }

// output:
// Enter the size of the array:6
// enter the elements:
// 1
// 2
// 3
// 4
// 5
// 6
// the array is:
// 1
// 2
// 3
// 4
// 5
// 6
// the even array elements are:
// 2
// 4
// 6
// the even_sum is:12
// the odd array elements are:
// 1
// 3
// 5
// the odd_sum is:9