public class sumpair4 {
    public static void main(String[] args) {
    int arr1[]={1,2,3,4,5};
    int sum=0;

    for(int i=0;i<arr1.length-2;i++){
        for(int j=i+1;j<arr1.length-1;j++){
            for(int k=j+1;k<arr1.length;k++){
                sum+=arr1[i]+arr1[j]+arr1[k];
            }
        }
    }
     System.out.println("the sum of the triplet pairs is:"+sum);
}
}

// output:
// the sum of the triplet pairs is:90