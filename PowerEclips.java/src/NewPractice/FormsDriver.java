package NewPractice;

public class FormsDriver {
    public static void main(String[] args) {
        Forms f1 = new Forms( "Aakash", "26/01/2001", 21, "aakash@hmail.com","Pune");
        
        
        f1.DisplayForms();
        System.out.println("============================================");
        
        Forms f2 = new Forms("Aakash", "26/01/2001", 21, "aakash@hmail.com","Pune", 1234567890l);
        
        f2.DisplayForms();
    }
}
