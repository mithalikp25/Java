//Print all numbers that are palindromes between 1–500. 

package logic_building;

import java.util.*;

public class logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=500;i++){
            int num=i;
            int rev=0;

            while(num!=0){
                int rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            if(rev==i){
                System.out.println(i);
            }
        }
    }
}


// Output:

// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 11
// 22
// 33
// 44
// 55
// 66
// 77
// 88
// 99
// 101
// 111
// 121
// 131
// 141
// 151
// 161
// 171
// 181
// 191
// 202
// 212
// 222
// 232
// 242
// 252
// 262
// 272
// 282
// 292
// 303
// 313
// 323
// 333
// 343
// 353
// 363
// 373
// 383
// 393
// 404
// 414
// 424
// 434
// 444
// 454
// 464
// 474
// 484
// 494