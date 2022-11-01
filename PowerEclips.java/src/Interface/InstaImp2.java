package Interface;

public abstract class InstaImp2 extends InstaImp{
    public void Post(String P) {
        System.out.println(P);
        System.out.println("Post Updated !...");
    }
    
    InstaImp2(String name, String Email, String pwd){
        this.name = name;
        this.Email = Email;
        this.pwd = pwd;
    }
}
