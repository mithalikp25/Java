//Print numbers between 1–100 whose digits add up to a multiple of 3

package logic_building;

import java.util.*;

public class logic4 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int num=i;
            int sum=0;

            while(num!=0){
                int rem=num%10;
                sum+=rem;
                num=num/10;
            }

            if(sum%3==0){
                System.out.println(i);
            }
        }
    }
}

// Output:
// 3
// 6
// 9
// 12
// 15
// 18
// 21
// 24
// 27
// 30
// 33
// 36
// 39
// 42
// 45
// 48
// 51
// 54
// 57
// 60
// 63
// 66
// 69
// 72
// 75
// 78
// 81
// 84
// 87
// 90
// 93
// 96
// 99