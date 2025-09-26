class Calculator{
    public int add(int n1,int n2){
        int r=n1+n2;
        return r;
    }
}


class Main{
    public static void main(String[] args){
        Calculator calc=new Calculator();
        //int result= calc.add(3,5);
        System.out.print(calc.add(3,6));
    }
}