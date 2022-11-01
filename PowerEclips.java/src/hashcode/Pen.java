package hashcode;
import java .lang.Object;
public class Pen extends Object {
    String color;
    double price;
    String brand;
    
    public Pen() {}
    
    Pen(String color, double price, String brand){
        this.color = color;
        this.price = price;
        this.brand = brand;
    }
    
    public void DisplayPen()
    {
        System.out.println(color);
        System.out.println(price);
        System.out.println(brand);
    }
    
    
    public boolean equals(Object o) {
        Pen p = (Pen)o;
    if(this.brand== p.brand && this.color == p.color && this.price ==p.price) {
        return true;
    }
    return false;
    }
    
    public int hashCode() {
        int hc = 0;
        hc+=price;
        hc+=color.hashCode();
        hc+=brand.hashCode();
        
        
        return hc;
    }
    
}
