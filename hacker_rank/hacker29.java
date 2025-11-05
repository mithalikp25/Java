package hacker_rank;

import java.util.*;

public class hacker29 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
    Arrays.sort(arr);

    for(int i=0;i<n;i++){
        int mini=arr[0];
        
        arr[i]=arr[i]-mini;
        System.out.print(arr[i]+" ");
        }
    

     }
}
