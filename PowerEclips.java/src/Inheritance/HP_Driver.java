// Single Level Inheritance
package Inheritance;

public class HP_Driver {
    public static void main(String[] args) {
        
    
    HP h1 = new HP("Hp", 33000.00, 8, 1, "I-5", "Pavillion", 123, 12.5, "Gold", "1.5KG");
    
    h1.DiplayHp();
    System.out.println("=================================");
    h1.DisplayLaptop();
    System.out.println(h1.brand);
    System.out.println(h1.name);
  }
}
