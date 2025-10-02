import java.util.*;

class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list+" ");

        list.add(0,100);//100 will be added at index 0 and all other elements will be shifted to right
        System.out.println(list);

        list.remove(5);//index 5 will be removed from the list
        System.out.println(list);

        list.set(4,200);//index 4 will be replaced by 200
        System.out.println(list);

       System.out.println(list.isEmpty());//to check if the list is empty or not
       System.out.println(list.contains(100));//to check if the list contains 100 or not
        
    }
}

// output:

// [10, 20, 30, 40, 50] 
// [100, 10, 20, 30, 40, 50]
// [100, 10, 20, 30, 40]
// [100, 10, 20, 30, 200]
// false
// true