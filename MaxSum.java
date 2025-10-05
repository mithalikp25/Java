class MaxSum {
 public static void main(String[] args) {
    int arr1[]={1,2,3,4};
    int arr2[]={5,6,7,8};

    int max_sum=0;

    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
        int sum =arr1[i]+arr2[j];
        max_sum=Math.max(max_sum, sum);
        }
    }
    System.out.println("the maximum sum of all the pairs is:"+max_sum);
 }   
}

// output:
// the maximum sum of all the pairs is:12