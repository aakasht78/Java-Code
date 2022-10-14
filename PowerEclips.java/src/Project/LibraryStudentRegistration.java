package Project;

public class LibraryStudentRegistration {
  private String Name;
  private int standard;
  private  int rollno;
  private int mobileno;
  private String password;
  
  
  public String getName() {
      return Name;
  }
  public int getStandard() {
      return standard;
  }
  public int getRollno() {
      return rollno;
  }
  public int getMobileno() {
      return mobileno;
  }
  public String getPassword() {
      return password;
  }
 
    
    LibraryStudentRegistration(){}

     LibraryStudentRegistration(String name, int standard, int rollno, int mobileno) {
//        super();
        Name = name;
        this.standard = standard;
        this.rollno = rollno;
        this.mobileno = mobileno;
    }
    
//     public void DisplayStudentData() {
//         System.out.println(Name);
//         System.out.println(standard);
//         System.out.println(rollno);
//         System.out.println(mobileno);
//     }
//    
    
     
     
}
