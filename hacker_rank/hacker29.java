/* VIRAL ADVERTISING

A product advertisement is shared among people in the following way:
- On the 1st day, 5 people receive it.
- Each day, floor(recipients / 2) people like the ad.
- Each person who likes it shares it with 3 friends the next day.

Given n (number of days), find the total number of people who liked the ad by the end of day n.

Example:
n = 5
Day Shared Liked Cumulative
1      5     2       2
2      6     3       5
3      9     4       9
4     12     6      15
5     18     9      24


*/


package hacker_rank;

import java.util.*;

public class hacker29 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int people=5;
    int liked=0;

    for(int i=0;i<n;i++){
        int like_people=Math.floorDiv(people,2);
        liked+=like_people;
        people=like_people*3;
    }
    System.out.println(liked);
     }
}


// output:

// 5
// 24

// 10
// 189