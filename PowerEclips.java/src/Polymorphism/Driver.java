package Polymorphism;

public class Driver {
    public static void main(String[] args) {
        Parent p = new Child();
        
        p.b();
        p.a();//overriding
    }
}
