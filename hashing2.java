import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class hashing2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        int hash[]=new int[51];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            hash[arr[i]]++;
        }

        int q=sc.nextInt();

        for(int i=0;i<q;i++){
            int query=sc.nextInt();
            int count=hash[query];
            System.out.println(count);
        }
    }
}

// output:
// 5 =>size of the array
// 1 1 1 2 2 =>array elements
// 2 =>no.of queries
// 1 2 =>queries
// 3 => occurence of 1
// 2 => occurence of 2