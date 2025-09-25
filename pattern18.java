import java.util.Scanner;

class pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.of rows:");
        int n= sc.nextInt();
int p=n;
        for(int rows=1;rows<=2*n-1;rows++){
            
            for(int cols=1;cols<=2*n-1;cols++){
                System.out.print(p);
                
            }
            p--;
            System.out.println();
        }
    }
    
}
