package NewPractice;

public class MouseDriver {
    public static void main(String[] args) {
        
        Mouse m1  = new Mouse();
        m1.brand = "acer";
        m1.price = 220.00;
        
        
        m1.PrintBrand().PrintPrice();//method chaining   
        
    }
}
