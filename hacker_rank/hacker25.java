// Designer PDF Viewer

// You are given:
// An array h[26], where each element represents the height of the letters a–z.
// A lowercase word.

// Each letter has a width = 1 and its height = h corresponding to that letter.
// When highlighting the word in a PDF viewer, the area of the highlight =
// (maximum letter height in the word) × (word length).

package hacker_rank;

import java.util.*;

public class hacker25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[]  = new int[26];
    for(int i=0;i<26;i++){
        arr[i]=sc.nextInt();
        }
        String str = sc.next();
        int max=0;

      for(int i=0;i<str.length();i++){
        int value= (int) str.charAt(i)-97;
        if(arr[value]>max){
            max=arr[value];
        }  
    }
    System.out.println(max*str.length());
}
}

// output:
// 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
// zaba