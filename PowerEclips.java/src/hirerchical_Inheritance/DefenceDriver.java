package hirerchical_Inheritance;

public class DefenceDriver {
    public static void main(String[] args) {
        
    
    Army a = new Army("minister Rajnath Singh","India","General Bipin Rawat",52166.00,"Bipin Rawat","land","Black-Gold",1237117);
   
 
    
    Navy n = new Navy("minister Rajnath Singh", "India", "General Bipin Rawat",47590.99,"Admiral R. Hari Kumar","land","NavyBlue-Gold",  67228);
    
    
    Airforce ai = new Airforce("minister Rajnath Singh", "India", "General Bipin Rawat",94078 ,"Air Chief Marshal Vivek Ram Chaudhari","land","Sky Blue",  139576);
    
    
//    a.DisplayArmy();
//    System.out.println("=========================");
//    n.DisplayNavy();
//    System.out.println("=========================");
//    ai.DisplayAirforce();
    
    System.out.println("Army Budget is :-"+a.budget + "cr");
    System.out.println("Airforce Budget is :-"+ai.budget+ "cr");
    System.out.println("Navy Budget is :-"+n.budget+ "cr");
    
    System.out.println("Uniform colour of army is :- "+a.Uniform);
    System.out.println("Uniform colour of airforce is :- "+ai.Uniform);
    System.out.println("Uniform colour of navy is :- "+n.Uniform);
    }
}
