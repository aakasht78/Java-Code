// lazy Instanciation
package Relationship;

public class Laptop {
    String brand;
    double price;
    int ram;
    int hd;
    String processor;
    
    Pendrive p;
    
    Laptop(){}
    
    
    Laptop(String brand,double price, int ram, int hd, String processor ){
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.hd = hd;
        this.processor = processor;
    }
    
   
    public void insertPendrive(String brand, double price, int speed, double memory) {
         p = new Pendrive(brand,price,memory,speed);
        System.out.println("Pendrive Inserted");
    }
    
    
    public void DisplayLaptop() {
        
        System.out.println(brand);
        System.out.println(price);
        System.out.println(ram);
        System.out.println(hd);
        System.out.println(processor);
    }
}
