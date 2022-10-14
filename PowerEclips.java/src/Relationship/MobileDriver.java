// Early Instanciation

package Relationship;

public class MobileDriver {
    public static void main(String[] args) {
        Mobile m = new Mobile("Apple", 55000.00, 6, 1, "Apple - A1");
        
        m.displayMobile();
        System.out.println("===========================");
        m.b.DisplayBattry();
    }
}
