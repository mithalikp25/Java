import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;

public class hacker2 {

    public static void main(String args[]) {
      
      
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      
      
      long sum=0;
      for(int i=0;i<n;i++){
          long value=in.nextLong();
          sum+=value;
      }
    
      System.out.print(sum);
    }
}

// output:
// 5
// 1234567
// 123456
// 45678
// 23456789
// 23456789
// ->output::48317279