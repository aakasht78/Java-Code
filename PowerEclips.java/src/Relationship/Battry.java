// Early Instanciation

package Relationship;

public class Battry {
    String brand;
    double price;
    int power;
    String composition;
    double wt;
    
    Battry(){}
    
    Battry(String brand,double price, int power, String composition, double wt){
        this.brand = brand;
        this.price = price;
        this.power = power;
        this.composition = composition;
        this.wt = wt;
    }
    
    public void DisplayBattry() {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(power);
        System.out.println(composition);
        System.out.println(wt);
    }
    
}
