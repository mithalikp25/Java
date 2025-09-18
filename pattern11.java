import java.util.Scanner;

public class pattern11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int x=n/2+1;
        for(int i=1;i<=n;i++){
            if(i<=x){
                for(int s=1;s<=n-i-1;s++){
                    System.out.print(" ");
                }
                for(int c=1;c<=2*i-1;c++){
                    System.out.print("*");
                }
            }
            else{
                for(int s=1;s<=i-2;s++){
                    System.out.print(" ");
                }
                for(int c=1;c<=2*n-2*i+1;c++){
                    System.out.print("*");
                }
            }
            
   
    System.out.println();
    
    }
        
    }
}


// output
// enter the number:7
//      *
//     ***
//    *****
//   *******
//    *****
//     ***
//      *