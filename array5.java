public class array5 {
    public static void main(String[] args) {
        int nums[][]= new int[3][4];

        for(int i=0;i<3;i++){
    for(int j=0;j<4;j++){
        nums[i][j]=(int)(Math.random()*100);
        System.out.print(nums[i][j]+" "); 
    }
      System.out.println(); 
        }
    }
}
       
// output:
// 99 86 41 20 
// 97 71 80 45
// 76 38 63 92