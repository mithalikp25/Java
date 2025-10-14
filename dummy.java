import java.util.*;
public class dummy {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the number of rows: ");
      int rows=sc.nextInt();
      System.out.print("enter the number of columns: ");    
      int cols=sc.nextInt();

      int [][] arr= new int[rows][cols];
      System.out.println("enter the elements of the array: ");
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
          arr[i][j]=sc.nextInt();
        }
      }
System.out.println("the elements of the array are: ");
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
         System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
      } 
    }
}