import java.util.*;

class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the arraylist:");
        int size=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("enter the elements:");
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
            System.out.println(list); 
        
    }
}

// output:
// Enter the size of the arraylist:5
// enter the elements:
// 1
// 2
// 3
// 4
// 5
// [1, 2, 3, 4, 5]