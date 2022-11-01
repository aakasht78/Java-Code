package Interface;

public class InstaImp3 extends InstaImp2 {
    public void call () {
        System.out.println("calling !....");
    }
    
       public InstaImp3(String name, String Email, String pwd){
        super(name, Email, pwd);    
   }
}
