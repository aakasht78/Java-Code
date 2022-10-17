// Single Level Inheritance
package Inheritance;

public class Laptop {
    String brand;
    double price;
    int ram;
    int hd;
    String processor;
    
    public Laptop() {}
    Laptop(String brand, double price , int ram, int hd, String processor){
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.hd = hd;
        this.processor = processor;
    }
    
    public void DisplayLaptop() {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(ram);
        System.out.println(hd);
        System.out.println(processor);
    }
}
