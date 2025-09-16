import java.util.Scanner;

class pattern4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        int p=65; 
        for (int i = 1; i <= n; i++) {  
                 
            for (int j = 1; j <= i; j++) {    
                System.out.print((char)p); 
                       
            }

            System.out.println();  
            p++;           
        }
    }
}

// output

// A
// BB
// CCC
// DDDD
// EEEEE


import java.util.Scanner;

class pattern4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {  
                 int p=65; 
            for (int j = 1; j <= i; j++) {    
                System.out.print((char)p); 
                     p++;  
            }

            System.out.println();  
                       
        }
    }
}


// output

// A
// AB
// ABC
// ABCD
// ABCDE