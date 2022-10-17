package hirerchical_Inheritance;

public class Airforce extends Defence {

    String General;
    String attack;
    String Uniform;
    int NumbersOfSolders;
    
    Airforce(){}
    
    Airforce(String Minster, String Country, String CDS, double budget, String General, String attack, String Uniform, int NumbersOfSolders){
        this.Minster = Minster;
        this.Country = Country;
        this.CDS = CDS;
        this.budget = budget;
        this.General = General;
        this.attack = attack;
        this.Uniform = Uniform;
        this.NumbersOfSolders = NumbersOfSolders; 
    }
    
    public void DisplayAirforce() {
        DisplayDefence();
        System.out.println(General);
        System.out.println(attack);
        System.out.println(Uniform);
        System.out.println(NumbersOfSolders);
    }
}
