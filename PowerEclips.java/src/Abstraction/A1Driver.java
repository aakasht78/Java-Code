package Abstraction;

public class A1Driver {
    public static void main(String[] args) {
        A1 a = new A1imp();
        a.a();
        a.b();
        
        System.out.println(a.add(10,2));
    }
}
