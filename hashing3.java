import java.util.*;

public class hashing3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer, Integer> hash=new HashMap<>();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            int g=hash.getOrDefault(arr[i], 0);
            hash.put(arr[i], g+1);
        }

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int query=sc.nextInt();
            int count=hash.getOrDefault(query, 0);
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