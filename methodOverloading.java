//method overloading

class Calculator{
    int num=9;
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int add(int n1,int n2,int n3){
        return n1*n2*n3;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int result = calc.add(2,3);
        System.out.println(result);
        int result1 = calc.add(2,3,4);
        System.out.println(result1);
    }
}

//so two methods with same name but different parameters is called method overloading 