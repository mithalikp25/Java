//methods

class Methodss{
    public void method1(){
        System.out.println("this is when no datatype is specified");
    }

     public String method2(int n1){
        if(n1>=10){
            return "you've entered number above 10";
        }
        else{
            return "you've entered number below 10";
        }    
    }
}
public class methods {
    public static void main(String[] args) {
        Methodss meth=new Methodss();
        meth.method1();
        String result2=meth.method2(11);
        System.out.println(result2);
    }
}
