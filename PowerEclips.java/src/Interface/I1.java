package Interface;

public interface I1 {
    public static final int a = 10;
    String s = "India";
    
    public abstract void test();
    void demo();
    
    static void main(String [] args) {
        System.out.println("Main () from I1");
    }
    public static int add(int a, int b) {
        return a+b;
    }
}
