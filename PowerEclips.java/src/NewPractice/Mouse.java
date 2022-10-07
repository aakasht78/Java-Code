package NewPractice;

public class Mouse {
    String brand;
    double price;
    String color;
    
    public Mouse PrintBrand() {
        System.out.println(brand);
        return this;
    }
    
    public Mouse PrintPrice() {
        System.out.println(price);
        return this;
    }
}
