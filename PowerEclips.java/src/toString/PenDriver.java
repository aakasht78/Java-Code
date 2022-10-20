package toString;

public class PenDriver {
    public static void main(String[] args) {
        Pen p = new Pen("Black", 10.00, "cello");
        
        System.out.println(p);
        System.out.println("ho"+p.toString());
        

        Pen p1 = new Pen("Blue", 11.00, "natraj");
        System.out.println(p1);
    }
}
