package Inheritance;

public class AB_Driver {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println("From A1 "+a1.a);
//        System.out.println(a1.d);  //We get Exception
        B b1 = new B();
        System.out.println("From B1 "+b1.a);
        System.out.println("From B1 "+b1.d);
       
       
    }
       
}
