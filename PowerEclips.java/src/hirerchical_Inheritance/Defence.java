package hirerchical_Inheritance;

public class Defence {
    String Minster;
    String Country;
    String CDS;
    double budget;
    
    
    Defence(){}
    
    Defence(String Minster, String Country, String CDS, double budeget){
        this.Minster = Minster;
        this.Country = Country;
        this.CDS = CDS;
        this.budget  = budget;
    }
    
    public void DisplayDefence() {
        System.out.println(Minster);
        System.out.println(Country);
        System.out.println(CDS);
        System.out.println(budget);
    }
    
    
    
    
    
   
}
