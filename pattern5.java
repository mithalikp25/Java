import java.util.Scanner;

class pattern5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
         
        for (int i = 1; i <= n; i++) {  
             int p=65;    
            for (int j = 1; j <= i; j++) {    
                System.out.print((char)p); 
                    
            }

            System.out.println();  
            p++;              
        }
    }
}