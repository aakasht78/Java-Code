package NewPractice;

public class book {
  public  String brand;
    double price;
    int page;
    String bind;
    int wt;
    String size;
   
    public book(String brand,double price ) {
    this.brand=brand;
    this.price = price;
    }  
    
    
    public void DisplayBook() {
        
        System.out.println(brand);
        System.out.println(price);
    }
 }
    
    
    


