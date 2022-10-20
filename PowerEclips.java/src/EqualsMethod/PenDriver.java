package EqualsMethod;

public class PenDriver {
    public static void main(String[] args) {
        pen p1 = new pen("cello", "blue", 20.00);
        pen p2 = new pen("cello", "blue", 20.00);
        
        System.out.println(p1 == p2);
        
        System.out.println(p1.equals(p2));
    }
}
