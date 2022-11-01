package Interface;

public class I1Imp implements I1 {
    public void demo() {
        System.out.println("From Demo() Imp");
        System.out.println(s);
        System.out.println(a);
    }
    
    public void test() {
        System.out.println("From test() of Imp");
    }
}
