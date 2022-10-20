package variableShadowing;

  public class SonDriver{
    public static void main(String[] args) {
        
        
        Father f = new Son();
       
        System.out.println(f.x);
        System.out.println(f.y);
        
    }
}