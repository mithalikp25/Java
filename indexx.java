import java.util.*;

public class indexx {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 8, 10};
        int first_index = -1;//if there is no target element existing in the array it will return -1
        int last_index = -1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        // First index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                first_index = i;
                break;
            }
        }

        // Last index
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                last_index = i;
                break;
            }
        }

        System.out.println("First index of target is " + first_index);
        System.out.println("Last index of target is " + last_index);
    }
}


// output:
// Enter the target value: 11
// First index of target is -1
// Last index of target is -1

// Enter the target value: 7
// First index of target is 4
// Last index of target is 4

// Enter the target value: 8
// First index of target is 5
// Last index of target is 6