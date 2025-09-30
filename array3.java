//multidimensional array when there are no values assigned before hand

public class array3 {
    public static void main(String[] args) {
        int num[][]=new int[3][3];
        num[0][0]=1;
        num[0][1]=2;

        System.out.println(num[0][0]);
        System.out.println(num[0][1]);
    }
}
