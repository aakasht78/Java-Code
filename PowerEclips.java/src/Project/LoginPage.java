package Project;

public class LoginPage {
  private  String UserId;
  private  String password;
    
      
      public String getUserId() {
          return UserId;
      }
      public String getPassword() {
          return password;
      }
  
  
      LoginPage(){}
      LoginPage(String UserId,String password){
          this.UserId = UserId;
          this.password = password;
      }
      
    
    
}
