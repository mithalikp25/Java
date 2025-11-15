//finding median on an array of integers

package hacker_rank;

import java.util.*;

public class hacker33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        double val;
        if(n % 2 != 0){ 
            val = arr[n/2];
        } else {
            val = (arr[n/2 - 1] + arr[n/2]) / 2.0;
        }

        System.out.println((int) val);

    }
}

//output:

// 5
// 3 1 2 5 4
// 3

// 7
// 0 1 2 4 6 5 3
// 3