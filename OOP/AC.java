public class AC {
    
    double price;
    String wt;
    int maxtemp;
    int mintemp;
    int currenttemp;
    double counsumption;
    String size;
    

    
    public void Display(){
        System.out.println("Price Is :- " +price);
        System.out.println("Weight Is :- " +wt);
        System.out.println("Size  Is :- " +size);
        
    }

    public void MaxTemp(int max){
        if (max >= 55) {
            System.out.println("MaximumTemp is :- " + maxtemp);
        }
    }

    public void MinTemp(int Min){
        if(Min >= -10 || Min <= 0){
            System.out.println("MinimumTemp is :- " + mintemp);
        }
    }
    public void CurrentTemp(int CurrentTemp){
        System.out.println("Current Temp is :- " + currenttemp);
    }
    public void counsumption(double counsumption){
        System.out.println("Counsumptionis :- " + counsumption);
    }
    
}
