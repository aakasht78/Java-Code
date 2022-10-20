package toString;
import java.lang.Object;
public class Pen extends Object{
    String color ;
    double price;
    String brand;
    
    public Pen() {}

    public Pen(String color, double price, String brand) {
        this.color = color;
        this.price = price;
        this.brand = brand;
    }
    public String toString() {
        return "[Brand : "+ brand +","+" Color :- "+ color +","+" price :- " + price+"]";   
    }
}
