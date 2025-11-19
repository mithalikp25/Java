//Print all numbers whose sum of digits is even (1–100)

package logic_building;

import java.util.*;

public class logic3 {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++){
            int num=i;
            int sum=0;

            int rev=0;
            while(num!=0){
                int rem=num%10;
                sum+=rem;
                rev=rev*10+rem;
                num=num/10;
            }
            if(sum%2==0){
                System.out.println(i);
            }
        }
    }
}

// Output:

// 2
// 4
// 6
// 8
// 11
// 13
// 15
// 17
// 19
// 20
// 22
// 24
// 26
// 28
// 31
// 33
// 35
// 37
// 39
// 40
// 42
// 44
// 46
// 48
// 51
// 53
// 55
// 57
// 59
// 60
// 62
// 64
// 66
// 68
// 71
// 73
// 75
// 77
// 79
// 80
// 82
// 84
// 86
// 88
// 91
// 93
// 95
// 97
// 99