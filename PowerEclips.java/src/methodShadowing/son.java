package methodShadowing;

public class son extends Father {
    public static void test() {
        System.out.println("From Static a() of son");
    }
    public void demo() {
        System.out.println("From non-Static demo() of son");
    }
}