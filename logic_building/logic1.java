//Count how many numbers between 1–500 are divisible by 7 but not by 5. 

package logic_building;

import java.util.*;

public class logic1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
int count=0;

        for(int i=1;i<=500;i++){
            if(i%7==0 && i%5!=0){
                count++;
            }
        }
        System.out.println(count); 
    }
}

// Output:

//57

// 7
// 14
// 21
// 28
// 42
// 49
// 56
// 63
// 77
// 84
// 91
// 98
// 112
// 119
// 126
// 133
// 147
// 154
// 161
// 168
// 182
// 189
// 196
// 203
// 217
// 224
// 231
// 238
// 252
// 259
// 266
// 273
// 287
// 294
// 301
// 308
// 322
// 329
// 336
// 343
// 357
// 364
// 371
// 378
// 392
// 399
// 406
// 413
// 427
// 434
// 441
// 448
// 462
// 469
// 476
// 483
// 497