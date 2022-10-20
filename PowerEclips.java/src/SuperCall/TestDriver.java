package SuperCall;

public class TestDriver {
    public static void main(String[] args) {
        Demo d = new Demo();
//        d.DisplayDemo();
        
        System.out.println(d instanceof Demo);
        System.out.println(d instanceof Test);
        
        
        Test t = new Test();
        System.out.println(t instanceof Demo);
        
    }
}
