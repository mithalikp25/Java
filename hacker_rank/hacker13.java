package hacker_rank;

import java.util.*;

public class hacker13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();

        int count=0;

        for (int i = 0; i <=n-m; i++) {
            int sum=0;
            for (int j = i; j < i+m; j++){
                sum+=arr[j];
            }
            if(sum==d){
                count++;
            }
        }
        System.out.println(count);
    }
}
