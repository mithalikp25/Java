package logic_building;

import java.util.*;

public class math3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number:");
        int a=sc.nextInt();
        System.out.print("enter the second number:");
        int b=sc.nextInt();

        for(int i=a;i<=b;i++){
            if(i%7==0){
                System.out.println(i);
            }
        }
    }
}

// Output:
// enter the first number:1
// enter the second number:70
// 7
// 14
// 21
// 28
// 35
// 42
// 49
// 56
// 63
// 70