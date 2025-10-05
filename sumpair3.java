import java.util.Scanner;

public class sumpair3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of first array:");
        int n1=sc.nextInt();    
        System.out.println("Enter the size of second array:");
        int n2=sc.nextInt();   
        
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        System.out.println("Enter elements of first array:");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        
        System.out.println("Enter elements of second array:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        System.out.println("elements of first array:");
        for(int i=0;i<n1;i++){
            System.out.println(arr1[i]);
        }
        
        System.out.println("elements of second array:");
        for(int i=0;i<n2;i++){
            System.out.println(arr2[i]);
        }

        int sum=0;

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                sum+=arr1[i]+arr2[j];
            }
        }
        System.out.println("the sum of all the pairs in the two arrays is: "+sum);
    }
}

//this program involves user input to enter the size and elements of two arrays and 
//then calculates the sum of all possible pairs formed by taking one element from each array.

// output:
// Enter the size of first array:
// 3
// Enter the size of second array:
// 3
// Enter elements of first array:
// 1
// 2
// 3
// Enter elements of second array:
// 4
// 5
// 6
// elements of first array:
// 1
// 2
// 3
// elements of second array:
// 4
// 5
// 6
// the sum of all the pairs in the two arrays is: 63