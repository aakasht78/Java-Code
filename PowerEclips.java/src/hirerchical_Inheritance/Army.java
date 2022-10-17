package hirerchical_Inheritance;

public class Army extends Defence {
    String General;
    String attack;
    String Uniform;
    int NumbersOfSolders;
    
    Army(){}
    
    Army(String Minster, String Country, String CDS, double budget, String General, String attack, String Uniform, int NumbersOfSolders){
        this.Minster = Minster;
        this.Country = Country;
        this.CDS = CDS;
        this.budget = budget;
        this.General = General;
        this.attack = attack;
        this.Uniform = Uniform;
        this.NumbersOfSolders = NumbersOfSolders; 
    }
    
    public void DisplayArmy() {
        DisplayDefence();
        
        System.out.println(General);
        System.out.println(attack);
        System.out.println(Uniform);
        System.out.println(NumbersOfSolders);
    }
}
