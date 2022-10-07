package NewPractice;

public class Forms {
    String Name;
    String dob;
    int age;
    String email;
    String address;
    long telno;
    
    
    Forms(){}
    Forms(String Name, String dob, int age, String email, String address){
        this.Name = Name;
        this.dob = dob;
        this.age = age;
        this.email = email;
        this.address = address;
    }
    Forms(String Name, String dob, int age, String email, String address, long telno){
        this.Name = Name;
        this.dob = dob;
        this.age = age;
        this.email = email;
        this.address = address;
        this.telno = telno;
    }
    
    
    public void DisplayForms() {
        System.out.println(Name);
        System.out.println(dob);
        System.out.println(age);
        System.out.println(email);
        System.out.println(address);
        System.out.println(telno);
    }
    
    
}
