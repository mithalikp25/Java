//method 1

import java.util.Scanner;

class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows: ");
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) { 
            int q=2*r-1;
            for(int s=1;s<=n-r+1;s++){
                System.out.print(q);
                q+=2;
            }
            int p=1;
            for (int c = 1; c <=r-1; c++) {
                System.out.print(p);
                p+=2;
            }
            System.out.println();
        }
    }
}


// output
// enter the rows: 5
// 13579
// 35791
// 57913
// 79135
// 91357


//method 2

import java.util.Scanner;

class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows: ");
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) { 
            
            for(int s=2*r-1;s<=n*2;s+=2){
                System.out.print(s);
                
            }
            int p=1;
            for (int c = 1; c <=r-1; c++) {
                System.out.print(p);
                p+=2;
            }
            System.out.println();
        }
    }
}

// output
// enter the rows: 5
// 13579
// 35791
// 57913
// 79135
// 91357