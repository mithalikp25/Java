public class fre {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 8, 10, 4, 5, 6, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            int count = 0; // reset count for each i

            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            System.out.println(arr[i] + " " + count);
        }
    }
}

// output:
// 3 1
// 4 2
// 5 2
// 6 3
// 7 2
// 8 3
// 8 3
// 10 1
// 4 2
// 5 2
// 6 3
// 6 3
// 7 2
// 8 3
// 9 1