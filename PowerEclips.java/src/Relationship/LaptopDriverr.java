// lazy Instanciation
package Relationship;

public class LaptopDriverr {
    public static void main(String[] args) {
        Laptop l = new Laptop("Apple", 155000.00, 12, 1,"Apple = AQ11");
        
        l.DisplayLaptop();
        l.insertPendrive("Sanddisk", 150.00, 50, 32);
        System.out.println("====================");
//        l.p.DisplayPendrive();   
        System.out.println(l.p.price);
      }
}
