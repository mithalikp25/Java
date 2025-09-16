//basic array

class arrays{
    public static void main(String[] args){
        //declaring an array
        int[] arr={1,23,4,56,78,9,10};
        //accessing elements of the array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

// // to add all the elements of the array

class arrays{
    public static void main(String[] args){
        int[] arr={1,23,4,56,78,9,10};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}


//method 1

class arrays{
    public static void main(String[] args){
        int[] arr={1,23,4,56,78,9,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("it is even:"+arr[i]);
            }
            else{
                System.out.println("it is not even:"+arr[i]);
            }
        }
       
    }
}

//method 2

class arrays{
    public static void main(String[] args){
        int[] arr={1,23,4,56,78,9,10};
        for(int i=0;i<arr.length;i++){
            String result= arr[i]%2==0?"even"+arr[i]:"odd"+arr[i];
                System.out.println(result);
            
        }
       
    }
}

//output

// it is not even:1
// it is not even:23
// it is even:4
// it is even:56
// it is even:78
// it is not even:9
// it is even:10

//count the number of even elements in the array

class arrays{
    public static void main(String[] args){
        int[] arr={1,23,4,56,78,9,10};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count=count+1;
            }     
    }
     System.out.print(count);
}}


//count the sum of even numbers in the array


class arrays{
    public static void main(String[] args){
        int[] arr={1,23,4,56,78,9,10};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count=count+arr[i];
            }     
    }
     System.out.print(count);
}}