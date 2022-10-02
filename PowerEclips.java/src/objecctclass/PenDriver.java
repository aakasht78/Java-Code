package objecctclass;

public class PenDriver {
    public static void main(String[] args) {
        
        Pen p=new Pen("Lexi", "Cello", "Black",10);
        System.out.println(p);
        System.out.println(p.toString());
        
        Pen P1= new Pen("Lexi", "Cello", "Black",10);
        
        System.out.println(P1==p);
        
        System.out.println(p.equals(P1));
        
        System.out.println(p.hashCode());
        System.out.println(P1.hashCode());
    }

}
