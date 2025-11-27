package hacker_rank;

import java.util.*;

public class pickingNumbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    Arrays.sort(arr);

    int arr2[]=new int[arr.length];
    int count=0;
    int b=0;

    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int sum= Math.abs(arr[i]-arr[j]);
            if(sum<=1){
                count++;
            }
        }

        arr2[b]=count;
        b++;
        count=0;
    }
    int max=0;
    for(Integer i:arr2){
        if(i>max){
            max=i;
        }
    }
    System.out.println(max+1);

    }
}
