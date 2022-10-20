package methodShadowing;

public class sonDriver {
    public static void main(String[] args) {
        
        Father f = new son();
        f.test();
        f.demo();
    }
}
