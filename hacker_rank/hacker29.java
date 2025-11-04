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
    for(int i=0;i<n;i++){
        int mini=0;
        int minii=Math.min(arr[i], mini);

        arr[i]=arr[i]-minii;
        System.out.print(arr[i]+" ");
        }
    

     }
}
