package SuperCall;

public class Bike extends TwoWheeler {
    String brand;
    String fuel;
    double price;
    
    Bike(){}
    
    Bike(int numberofWheels, int seat, String brand, String fuel, double price){
        super(numberofWheels, seat);
        this.brand = brand;
        this.fuel = fuel;
        this.price = price;
    }
    
    public void DisplayBike() {
        DisplayTwoWheeler();
        System.out.println(brand);
        System.out.println(fuel);
        System.out.println(price);
    }
    
}
