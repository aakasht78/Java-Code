package EqualsMethod;
import java.lang.Object;
public class pen {
    String brand;
    String color;
    double price;
    pen(){}
    
    pen(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
   
    public boolean equals(Object o) {
        pen p = (pen)o;
        if(this.brand == p.brand && this.price == p.price && this.color == p.color) {
            return true;
        }
        return false;
        
    }
}
