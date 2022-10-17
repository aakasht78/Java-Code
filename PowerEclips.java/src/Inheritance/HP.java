// Single Level Inheritance
package Inheritance;

public class HP extends Laptop{
    String name;
    int model;
    double size;
    String color;
    String wt;
    
    public HP(){}

    HP(String brand, double price , int ram, int hd, String processor, String name, int model, double size, String color, String wt){
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.hd = hd;
        this.processor = processor;
        this.name = name;
        this.model = model;
        this.size = size;
        this.color = color;
        this.wt = wt;
    }
    
    
    public void DiplayHp() {
        DisplayLaptop();
        System.out.println(name);
        System.out.println(model);
        System.out.println(size);
        System.out.println(color);
        System.out.println(wt);
    }
    
}
