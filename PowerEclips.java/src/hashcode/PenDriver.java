package hashcode;

public class PenDriver {
    public static void main(String[] args) {
        
        Pen p = new Pen("black", 20.00, "cello");

        Pen p1 = new Pen("green", 20.00, "cello");
        
        
        System.out.println(p);
//        System.out.println(p1);
        System.out.println("----------------");
        System.out.println(p.hashCode());
//        System.out.println(p1);
    }
}
