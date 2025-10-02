public class array4 {
    public static void main(String[] args) {
        int num[][]=new int[3][3];

        num[0][0]=10;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}


// output:
// 10 0 0 
// 0 0 0
// 0 0 0