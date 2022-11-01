package Interface;

public class I1Driver {
    public static void main(String[] args) {
        
        I1 i= new I1Imp() ;
        
        i.demo();
        i.test();
        System.out.println(I1.add(10,20));
    }
}
