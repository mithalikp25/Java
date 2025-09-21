import java.util.Scanner;

class pattern16{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no.of rows");
        int n=sc.nextInt();
    
        for(int r =1;r<=n;r++){
           
            int sum=0;
            for(int c=1;c<=r;c++){
                System.out.print(c);
                if(c<r){
                System.out.print("+");
                }       
                sum=sum+c;
            }
            System.out.println("="+sum);
        }
    }
}

// output
// enter the no.of rows4
// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10