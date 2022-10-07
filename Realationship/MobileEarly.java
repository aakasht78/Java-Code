public class MobileEarly{
    String brand;
    double price;
    int power;
    String composition;
    double wt;

    
    Battry b = new Battry("Xyz", 1500, "lion", 200);
    // public mobile(){}

   MobileEarly(String brand,double price, int power, String compoaition, double wt){
        this.brand=brand;
        this.price=price;
        this.power = power;
        this.compoaition = compoaition;
        this.wt=wt;
    }

    public void displayMobile(){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(power);
        System.out.println(composition);
        System.out.println(wt);
    }



}
