import java.util.*;

public class distinct {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1,2,3,3,7,8,8,9};
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
              if(arr[i]!=arr[i+1]){
                  count++;
              } 
            }
            count++;
        System.out.println("the number of distinct elements in the array is:"+count);
        }
    }

// here every time two adjacent elements are not equal the counter is incremented by 1
// but in the end after the loop we are incrementing the counter by 1 as we are ending the loop to one less than the array size
// tho this will give correect input

// output:
// the number of distinct elements in the array is:8