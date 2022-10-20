package SuperCall;

public class Demo extends Test {
    boolean a = true;
    public void a() {
        System.out.println("From class Demo Method a()");
    }
    public void DisplayDemo() {
        System.out.println(a);
        a();
//        super(super.a);
        super.a();
    }
}
