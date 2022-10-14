package Project;

public class LibraryTeacherRegistration {
    private String name;
    private long phno;
    private String teacherID;
    private String password;
    
    
    
     public String getName() {
         return name;
     }
     public long getPhno() {
         return phno;
     }
     public String getTeacherID() {
         return teacherID;
     }
     public String getPassword() {
         return password;
     }
  
     LibraryTeacherRegistration(){}
    
     LibraryTeacherRegistration(String name, long phno, String teacherID) {
        this.name = name;
        this.phno = phno;
        this.teacherID = teacherID;
    }
     
     public void DisplayLibraryTeacherRegistration() {
         System.out.println(name);
         System.out.println(phno);
         System.out.println(teacherID);
     }
    
     
     
    
    
}
