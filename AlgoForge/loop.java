package AlgoForge;

public class loop {
  public static void main(String[] args) {

        // ------------------------------
        // 1. FOR LOOP
        // ------------------------------
        System.out.println("FOR LOOP:");
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ------------------------------
        // 2. WHILE LOOP
        // ------------------------------
        System.out.println("WHILE LOOP:");
        int j = 0;
        while (j <= 5) {
            System.out.print(j + " ");
            j++; // increment inside loop
        }
        System.out.println("\n");

        // ------------------------------
        // 3. DO-WHILE LOOP
        // ------------------------------
        System.out.println("DO-WHILE LOOP:");
        int k = 0;
        do {
            System.out.print(k + " ");
            k++; // increment inside loop
        } while (k <= 5);
        System.out.println("\n");
    }
}


// | Loop Type    | When to Use                                        |
// | ------------ | -------------------------------------------------- |
// | **for**      | Known number of iterations, compact loop           |
// | **while**    | Unknown iterations, check before running           |
// | **do-while** | Unknown iterations, but must run at least once     |


// Output:

// FOR LOOP:
// 0 1 2 3 4 5 

// WHILE LOOP:
// 0 1 2 3 4 5 

// DO-WHILE LOOP:
// 0 1 2 3 4 5 
