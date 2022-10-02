package objecctclass;

public class Pen {
    String name;
    String brand;
    String color;
    int price;
    
   public  Pen()
    {
        
    }
    
    Pen(String name, String brand, String color,int price)
    {
        super();
        
        this.name=name;
        this.brand=brand;
        this.color=color;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Pen [name=" + name + ", brand=" + brand + ", color=" + color + " price="+price+"]";
    }
    
    public boolean equals(Object o)
    {
        Pen p=(Pen) o;
        if(this.name==p.name && this.brand==p.brand && this.color==p.color )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   
    
   

}
