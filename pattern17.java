import java.util.Scanner;

class pattern17{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no.of rows:");
        int n=sc.nextInt();
        for(int r =1;r<=n;r++){       
            for(int c=1;c<=r;c++){
                if(c==1 || r==n || c==r){
                System.out.print("*");
            }
        else{
            System.out.print(" ");
        }}
            System.out.println();
        }
    }
}

// output
// enter the no.of rows:5
// *
// **
// * *
// *  *
// *****

import java.util.Scanner;

class pattern17{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no.of rows:");
        int n=sc.nextInt();
        for(int r =1;r<=n;r++){ 
            for(int s=1;s<=n-r+1;s++){
                System.out.print(" ");
          }      
            for(int c=1;c<=2*r-1;c++){
                if(r==n || c==1 || c==2*r-1){
                System.out.print("*");
          }
        
            else{
            System.out.print(" ");
          }}
            System.out.println();
        }
    }
}

// output
// enter the no.of rows:4
//     *
//    * *
//   *   *
//  *******


import java.util.Scanner;

class pattern17{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no.of rows:");
        int n=sc.nextInt();
        for(int r =1;r<=n;r++){ 
            for(int s=1;s<=r;s++){
                System.out.print(" ");
          }      
            for(int c=1;c<=2*(n-r)+1 ;c++){
                if(r==1 || c==1 || c==2*(n-r)+1){
                System.out.print("*");
          }
        
            else{
            System.out.print(" ");
          }}
            System.out.println();
        }
    }
}

// output
// enter the no.of rows:5
//  *********
//   *     *
//    *   *
//     * *
//      *