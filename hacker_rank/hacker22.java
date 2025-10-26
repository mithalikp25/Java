// Given a year year, find the 256th day of that year according to the official Russian calendar during that period.

package hacker_rank;

import java.util.*;

public class hacker22 {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int year=in.nextInt();
      String date="";
 
      if(year<1918){
          date+=(year%4==0)?"12.09."+ year :"13.09."+year;
      }else if(year==1918){
          date+="26.09."+year;
      }else{
          date+=((year%400==0) || (year%4==0 && year%100!=0))?"12.09."+year :"13.09."+year;
      }
      System.out.println(date);
    }
}
 
// Output

// 1956
// 12.09.1956