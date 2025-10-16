// Given a time in -hour AM/PM format, convert it to military (24-hour) time.

// Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
// - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

// Example

// 12:01:00PM
// Return '12:01:00'.

// 12:01:00AM
// Return '00:01:00'.

package hacker_rank;

import java.io.*;
import java.util.*;

public class hacker7 {
        public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();

        if(s.charAt(8)=='P'){
          String portion=s.substring(0,8);
          String[] time=portion.split(":");
          if(time[0]=="12"){
              System.out.println(time[0]+":"+time[1]+":"+time[2]);
          }else{
              time[0]=String.valueOf(Integer.valueOf(time[0])+12);
              System.out.println(time[0]+":"+time[1]+":"+time[2]);
          }
      }
      else if(s.charAt(8)=='A'){
          String portion=s.substring(0,8);
          String[] time=portion.split(":");
          if(time[0].equals("12")){
              time[0]="00";
              System.out.println(time[0]+":"+time[1]+":"+time[2]);
          }else{
              System.out.println(portion);
          }
      }
    }
}

// output:
// Input (stdin)
// 07:05:45PM
// Your Output (stdout)
// 19:05:45