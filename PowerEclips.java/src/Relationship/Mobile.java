// Early Instanciation
package Relationship;

public class Mobile {
    String brand;
    double price;
    int ram;
    int hd;
    String processor;
    
    
    Battry b = new Battry("XYZ",250.0,6000,"Li-on",20.0);
    
    Mobile(){}




       Mobile(String brand, double price, int ram, int hd, String processor) {
        super();
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.hd = hd;
        this.processor = processor;
    }
     
       public void displayMobile() {
           System.out.println(brand);
           System.out.println(price);
           System.out.println(ram);
           System.out.println(hd);
           System.out.println(processor);
       }
       
       
  
    
    
}
