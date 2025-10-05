public class SumPair {
    public static void main(String[] args) {
        int arr[]={2,4,6,3,5,7};
        int arr2[]={2};
        int sum=0;
        int sum2=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[i]+arr[j];
            }
        }
        System.out.println("the sum of all the pairs in the array is: "+sum);
        
        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                sum2+=arr2[i]+arr2[j];
            }
        }
        System.out.println("the sum of all the pairs in the array is: "+sum2);
    }
}

// basically this code is to find the sum of all the pairs in the array

// so we can consider
// (2,4), (2,6), (2,3), (2,5), (2,7)
// (4,6), (4,3), (4,5), (4,7)
// (6,3), (6,5), (6,7)
// (3,5), (3,7)
// (5,7)

// these pairs are possible in the array

// so we notice that the first element is fixed and the pair is formed with the next elements.
// Thus,i runs for fixed element and j runs for the next elements

// here,i and j in arrays indicates indices


// output:
// the sum of all the pairs in the array is: 135
//the sum of all the pairs in the array is: 0