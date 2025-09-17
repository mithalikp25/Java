import java.util.Scanner;

class pattern6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
         
        for (int i = 1; i <= n; i++) {  
            int p=i;     
            for (int j = 1; j <= i; j++) {    
                System.out.print(p + " "); 
                p++;       
            }

            System.out.println();  
                       
        }
    }
}

// output
// 1 
// 2 3
// 3 4 5
// 4 5 6 7
// 5 6 7 8 9