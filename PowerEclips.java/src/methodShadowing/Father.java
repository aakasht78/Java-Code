package methodShadowing;

public class Father {
    public static void test() {
        System.out.println("From Static test() of Father");
    }
    public void demo() {
        System.out.println("From non-Static demo() of Father");
    }
}

