public class zpattern {
    public static void main(String[] args) {
        int[][] arr={
            {1, 2, 3,4},
            {5, 6, 7,8},
            {9, 1, 2,3},
            {1, 2, 3,4}
        };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0 ||i==arr.length-1 || i+j==arr.length-1){
                System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


// output:
// 1 2 3 4 
//     7
//   1
// 1 2 3 4