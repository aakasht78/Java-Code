// lazy Instanciation
package Relationship;

public class Pendrive {
    String brand;
    double price;
    double memory;
    int speed;
    
    Pendrive(){}
    
    Pendrive(String brand, double price, double memory, int speed ){
        this.brand = brand;
        this.price = price;
        this.memory = memory;
        this.speed = speed;
    }
    
    
    public void DisplayPendrive() {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(memory);
        System.out.println(speed);
    }
}
