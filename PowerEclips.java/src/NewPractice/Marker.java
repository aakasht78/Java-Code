package NewPractice;

public class Marker {
    String brand;
    String color;
    int price;
    
    
    Marker(){}
    
    Marker(String brand, String color, int price){
       this.brand = brand;
       this.color = color;
       this.price = price;
    }
    
    public void displayMarker() {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(price);
    }
}
