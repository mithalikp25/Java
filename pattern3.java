import java.util.Scanner;

class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        int p=1; 
        for (int i = 1; i <= n; i++) {  
                 
            for (int j = 1; j <= i; j++) {    
                System.out.print(p); 
                       
            }

            System.out.println();  
            p++;           
        }
    }
}


// output
// 1
// 22
// 333
// 4444
// 55555

import java.util.Scanner;

class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {  
            int p=1; 
            for (int j = 1; j <= i; j++) {    
                System.out.print(p); 
                p++;        
            }
            System.out.println();                      
        }
    }
}

// output1
// 12
// 123
// 1234
// 12345