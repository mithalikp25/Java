package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hacker15 {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];

      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      HashMap<Integer,Integer> mp=new HashMap<>();

      for(int i=0;i<n;i++){
        int num=arr[i];
        if(mp.containsKey(num)){
            mp.put(num,mp.get(num)+1);
        }
        else{
            mp.put(num,1);
        }
      }
      int ans=0;
      int max=0;
      for(Integer key:mp.keySet()){
            int value=mp.get(key);
            if(value>max){
                max=value;
                ans=key;
            }
      }
System.out.println(ans);
    }
}
