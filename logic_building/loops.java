package logic_building;

import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to generate tables");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
                System.out.println(n+"x"+i+"="+n*i);
        }
    }
}

// output:
// enter a number to generate tables
// 5
// 5x1=5
// 5x2=10
// 5x3=15
// 5x4=20
// 5x5=25
// 5x6=30
// 5x7=35
// 5x8=40
// 5x9=45
// 5x10=50
