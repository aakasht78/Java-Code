package Interface;

public abstract class InstaImp extends Object implements Instagram{
    public void chat(String a) {
        System.out.println(a);
        System.out.println("Sent !...");
    }
    
    public void comment(String s) {
        System.out.println(s);
        System.out.println("commented");
    }
}
