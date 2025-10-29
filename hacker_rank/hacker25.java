package hacker_rank;

import java.util.*;

public class hacker25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[]  = new int[26];
    for(int i=0;i<26;i++){
        arr[i]=sc.nextInt();
        }
        String str = sc.next();
        int max=0;

      for(int i=0;i<str.length();i++){
        int value= (int) str.charAt(i)-97;
        if(arr[value]>max){
            max=arr[value];
        }  
    }
    System.out.println(max*str.length());
}
}