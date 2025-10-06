public class test {
 public static void main(String[] args) {
    for(int i=1;i<=50;i++){
        int count=0;
        for(int j=1;j<=i;j++){
           if(i%j==0){
            count++;
           }
        }
        if(count==2){
                System.out.println(i);
            }
    }
    System.out.println("prime numbers between 1 to 20" );
 }   
}

// output:
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19
// prime numbers between 1 to 20