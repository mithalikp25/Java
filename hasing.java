//Hasing concept

import java.util.Scanner;

public class hasing {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
 
        int q = scanner.nextInt();
 
        for (int i = 0; i < q; i++) {
            int query = scanner.nextInt();
 
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (array[j] == query) {
                    count++;
                }
            }
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